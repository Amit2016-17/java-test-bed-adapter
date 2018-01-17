package eu.driver.adapter.properties;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Properties object that contains extends the standard Kafka properties with
 * properties used specifically by the Consumers. Sets default values for the
 * local test-bed upon creation.
 * 
 * @author hameetepa
 *
 */
public class ConsumerProperties extends KafkaProperties {

	private static final long serialVersionUID = -2740620439918784263L;

	public static final String GROUP_ID = ConsumerConfig.GROUP_ID_CONFIG;
	public static final String KEY_DESERIALIZER = ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG;
	public static final String VALUE_DESERIALIZER = ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG;
	
	private static final Logger logger = LoggerFactory.getLogger(ConsumerProperties.class);

	private static ConsumerProperties instance;

	/**
	 * 
	 * @return The Singleton Consumer Properties object containing all Kafka
	 *         consumer related configuration.
	 */
	public static ConsumerProperties getInstance() {
		if (instance == null) {
			instance = new ConsumerProperties();
		}
		return instance;
	}

	private ConsumerProperties() {
		super();
		setDefaults();
		loadConfigFile();
	}
	
	private void loadConfigFile() {
		try {
			FileInputStream fis = new FileInputStream("config/consumer.properties");
			load(fis);
			fis.close();
		} catch (IOException e) {
			logger.error("Could not read Consumer Properties file consumer.properties in config folder");
		}
	}

	private void setDefaults() {
		setProperty(GROUP_ID, "default_java_adapter_group");
		setProperty(KEY_DESERIALIZER, "io.confluent.kafka.serializers.KafkaAvroDeserializer");
		setProperty(VALUE_DESERIALIZER, "io.confluent.kafka.serializers.KafkaAvroDeserializer");
	}

}
