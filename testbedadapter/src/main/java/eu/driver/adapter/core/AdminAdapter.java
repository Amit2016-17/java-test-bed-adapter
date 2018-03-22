package eu.driver.adapter.core;


import java.util.HashMap;
import java.util.Map;

import org.apache.avro.generic.IndexedRecord;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;

import eu.driver.adapter.constants.AdapterMode;
import eu.driver.adapter.constants.TopicConstants;
import eu.driver.adapter.core.consumer.AdapterCallbackConsumer;
import eu.driver.adapter.core.consumer.GenericCallbackConsumer;
import eu.driver.adapter.core.producer.GenericProducer;
import eu.driver.adapter.core.producer.HeartbeatProducer;
import eu.driver.adapter.core.producer.LogProducer;
import eu.driver.adapter.core.producer.admin.AdminHeartbeatProducer;
import eu.driver.adapter.excpetion.CommunicationException;
import eu.driver.adapter.logger.CISLogger;
import eu.driver.adapter.properties.ClientProperties;
import eu.driver.adapter.properties.ConsumerProperties;
import eu.driver.adapter.properties.ProducerProperties;
import eu.driver.api.GenericAvroReceiver;
import eu.driver.api.IAdaptorCallback;
import eu.driver.model.edxl.EDXLDistribution;

public class AdminAdapter {
	
	private static AdminAdapter aMe = null;
	
	/**
	 * Kafka Producer shared by all specific Producers for sending Avro messages to
	 * the CIS.
	 */
	private Producer<EDXLDistribution, IndexedRecord> sharedAvroProducer;
	
	private Map<String, GenericProducer> producerMap = new HashMap<String, GenericProducer>();
	
	private GenericProducer topicInviteProducer = null;
	
	/*
	 * The Core Producers
	 */
	private AdminHeartbeatProducer heartbeatProducer;
	
	private CISLogger logger = new CISLogger(AdminAdapter.class);
	private Boolean connectModeSec = false;
	
	private AdminAdapter() {
		try {
			initializeProducers();
		} catch (Exception e) {
			
		}
	}
	
	public static synchronized AdminAdapter getInstance() {
		if (AdminAdapter.aMe == null) {
			AdminAdapter.aMe = new AdminAdapter();
		}
		return AdminAdapter.aMe;
	}
	
	/**
	 * Initializes the core producers used by the CIS Adapter
	 */
	private void initializeProducers() throws Exception {
		logger.info("--> initializeProducers");
		sharedAvroProducer = new KafkaProducer<EDXLDistribution, IndexedRecord>(ProducerProperties.getInstance(connectModeSec));
		try {
			logger.info("Check Adpter DEV Mode");
			heartbeatProducer = new AdminHeartbeatProducer(sharedAvroProducer, TopicConstants.ADMIN_HEARTBEAT_TOPIC);	
			heartbeatProducer.sendInitialHeartbeat();
		} catch (Exception cEx) {
			logger.info("CISAdapter initialized failed with non secure connection!");
			logger.info("Check Adpter SEC DEV Mode");
			connectModeSec = true;
			sharedAvroProducer = new KafkaProducer<EDXLDistribution, IndexedRecord>(ProducerProperties.getInstance(connectModeSec));
			try {
				heartbeatProducer = new AdminHeartbeatProducer(sharedAvroProducer, TopicConstants.ADMIN_HEARTBEAT_TOPIC);	
				heartbeatProducer.sendInitialHeartbeat();
			} catch (Exception e) {
				logger.info("Adapter cannot be initialized, something is wrong!");
				throw new Exception("Adapter cannot be initialized, something is wrong!");
			}
		}
		
		this.startHeartbeats();
		logger.info("initializeProducers -->");
	}
	
	public void addCallback(IAdaptorCallback callback, String topicName) {
		logger.info("--> addCallback: " + topicName);
		
		AdapterCallbackConsumer callbackConsumer = new AdapterCallbackConsumer(callback);
		addAvroReceiver(topicName, callbackConsumer);
		
		logger.info("addCallback-->");
	}
	
	private void addAvroReceiver(String topic, GenericAvroReceiver receiver) {
		GenericCallbackConsumer consumer = new GenericCallbackConsumer(
				new KafkaConsumer<IndexedRecord, IndexedRecord>(ConsumerProperties.getInstance(connectModeSec)), topic);
		Thread t = new Thread(consumer); // TODO: maintain this and clean up thread
		t.start();
		logger.info("New Generic Callback Consumer created for topic: " + topic);
		consumer.addReceiver(receiver);
	}
	
	/**
	 * Start sending period Heartbeat messages
	 */
	private void startHeartbeats() {
		ClientProperties props = ClientProperties.getInstance();
		int heartbeatInterval = Integer.parseInt(props.getProperty(ClientProperties.HEARTBEAT_INTERVAL));
		heartbeatProducer.startHeartbeats(heartbeatInterval);
	}
	
	public void sendMessage(IndexedRecord message, String topicName) throws CommunicationException {
		GenericProducer producer = producerMap.get(topicName);
		if (producer != null) {
			producer.send(message);
		}
	}
	
	public void sendTopicInviteMessage(IndexedRecord messge) throws CommunicationException {
		if (topicInviteProducer == null) {
			topicInviteProducer = new GenericProducer(sharedAvroProducer, TopicConstants.TOPIC_INVITE_TOPIC);
		}
		topicInviteProducer.send(messge);
	}
	
	

}
