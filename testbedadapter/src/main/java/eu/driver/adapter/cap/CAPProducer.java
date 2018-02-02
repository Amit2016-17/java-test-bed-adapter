package eu.driver.adapter.cap;

import org.apache.avro.generic.IndexedRecord;
import org.apache.kafka.clients.producer.Producer;

import eu.driver.adapter.core.producer.AbstractProducer;
import eu.driver.model.edxl.EDXLDistribution;

public class CAPProducer extends AbstractProducer {

	public CAPProducer(Producer<IndexedRecord, IndexedRecord> producer, String topic) {
		super(producer, topic);
	}

	@Override
	protected EDXLDistribution setEDXLDEValues(EDXLDistribution standardKey) {
		return standardKey;
	}

}
