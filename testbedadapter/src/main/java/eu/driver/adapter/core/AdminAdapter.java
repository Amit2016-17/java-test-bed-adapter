package eu.driver.adapter.core;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.avro.generic.IndexedRecord;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;

import eu.driver.adapter.constants.AdapterMode;
import eu.driver.adapter.constants.TopicConstants;
import eu.driver.adapter.core.consumer.AdapterCallbackConsumer;
import eu.driver.adapter.core.consumer.AdminTimeConsumer;
import eu.driver.adapter.core.consumer.GenericCallbackConsumer;
import eu.driver.adapter.core.consumer.TimeConsumer;
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
import eu.driver.model.core.Log;
import eu.driver.model.edxl.EDXLDistribution;
import eu.driver.model.sim.config.TimeManagement;
import eu.driver.model.sim.config.TimeState;

public class AdminAdapter {
	
	private static AdminAdapter aMe = null;
	
	/**
	 * Kafka Producer shared by all specific Producers for sending Avro messages to
	 * the CIS.
	 */
	private Producer<EDXLDistribution, IndexedRecord> sharedAvroProducer;
	
	private Map<String, GenericProducer> producerMap = new HashMap<String, GenericProducer>();
	
	private GenericProducer topicInviteProducer = null;
	
	private List<GenericCallbackConsumer> consumers = new ArrayList<GenericCallbackConsumer>();
	
	/*
	 * The Core Producers
	 */
	private AdminHeartbeatProducer heartbeatProducer;
	private LogProducer logProducer;
	
	private CISLogger logger = new CISLogger(AdminAdapter.class);
	private Boolean connectModeSec = false;
	
	private TimeManagement timing = null;
	private long updatedSimTimeAt = new Date().getTime();
	private long pTrialTimeSpeed = 0;
	private TimeState pState = TimeState.Initialization;
	private long pTrialTime = 0;
	
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
	
	public void closeAdapter() {
		// Stop Heartbeat
		heartbeatProducer.stopHeartbeats();
		
		// Stop/Close All Consumers
		for (GenericCallbackConsumer consumer : this.consumers) {
			consumer.stop();
		}
		consumers.clear();
		
		AdminAdapter.aMe = null;
	}
	
	/**
	 * Initializes the core producers used by the CIS Adapter
	 */
	private void initializeProducers() throws Exception {
		logger.info("initializeProducers");
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
				//addAvroReceiver(TopicConstants.TIMING_CONTROL_TOPIC, new AdminTimeConsumer());
			} catch (Exception e) {
				logger.info("Adapter cannot be initialized, something is wrong!");
				throw new Exception("Adapter cannot be initialized, something is wrong!");
			}
		}
		
		this.startHeartbeats();
		logProducer = new LogProducer(sharedAvroProducer);
	}
	
	public void addCallback(IAdaptorCallback callback, String topicName) {
		logger.info("addCallback: " + topicName);
		
		AdapterCallbackConsumer callbackConsumer = new AdapterCallbackConsumer(topicName, callback);
		addAvroReceiver(topicName, callbackConsumer);
	}
	
	public void addLogEntry(Log logEntry) throws CommunicationException {
		logger.debug("--> addLogEntry");
		if (logProducer != null) {
			logProducer.send(logEntry);	
		} else {
			throw new CommunicationException("There is no producer for that topic available! Message could not be sent.");
		}
		logger.debug("addLogEntry -->");
	}
	
	private void addAvroReceiver(String topic, GenericAvroReceiver receiver) {
		GenericCallbackConsumer consumer = new GenericCallbackConsumer(
				new KafkaConsumer<IndexedRecord, IndexedRecord>(ConsumerProperties.getInstance(connectModeSec)), topic);
		Thread t = new Thread(consumer); // TODO: maintain this and clean up thread
		t.start();
		logger.info("New Generic Callback Consumer created for topic: " + topic);
		consumer.addReceiver(receiver);
		this.consumers.add(consumer);
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
	
	public void setCurrentTiming(TimeManagement timing) {
		synchronized(this.timing) {
			this.timing = timing;
			long latency = 0;
			this.updatedSimTimeAt = new Date().getTime();
		    this.pTrialTimeSpeed = timing.getSimulationSpeed().longValue();
		    if (timing.getState() != null) {
		      this.pState = timing.getState();
		    }
		    this.pTrialTime = timing.getSimulationTime() + latency * timing.getSimulationSpeed().longValue();
		}
	}
	
	public TimeManagement getTimeInfo() {
		if (this.timing != null) {
			synchronized(this.timing) {
				return this.timing;
			}
		}
		return null;
	}
	
	/**
	 * Get the simulation time as Date.
	 */
	public Date getTrialTime() {
		long now = new Date().getTime();
	    long timePassedSinceLastUpdate = now - this.updatedSimTimeAt;
	    return this.pState == TimeState.Initialization
	      ? new Date()
	      : new Date(this.pTrialTime + timePassedSinceLastUpdate * this.pTrialTimeSpeed);
	}
	
	/**
	 * Get elapsed time in msec.
	 */
	public long getTimeElapsed() {
	    long now = new Date().getTime();
	    long timePassedSinceLastUpdate = now - this.updatedSimTimeAt;
	    return this.pTrialTime + timePassedSinceLastUpdate;
	}
	
	public TimeState getState() {
	    return this.pState;
	}
	
	/**
	 * Positive number, indicating how fast the simulation / trial time moves with respect
	 * to the actual time. A value of 0 means a pause, 1 is as fast as real-time.
	 */
	public long getTrialSpeed() {
	    return this.pTrialTimeSpeed;
	}
	
	

}
