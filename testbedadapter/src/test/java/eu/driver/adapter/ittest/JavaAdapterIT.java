package eu.driver.adapter.ittest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.apache.avro.generic.IndexedRecord;
import org.apache.avro.specific.SpecificData;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import eu.driver.adapter.constants.TopicConstants;
import eu.driver.adapter.core.CISAdapter;
import eu.driver.adapter.excpetion.CommunicationException;
import eu.driver.adapter.properties.ClientProperties;
import eu.driver.adapter.properties.ConsumerProperties;
import eu.driver.api.IAdaptorCallback;
import eu.driver.model.cap.Alert;
import eu.driver.model.cap.MsgType;
import eu.driver.model.cap.Scope;
import eu.driver.model.cap.Status;
import eu.driver.model.core.Heartbeat;

/**
 * Small Integration test for the Java test bed adapter.
 * 
 * This assumes that a DRIVER+ Testbed instance is running: broker @
 * localhost:3501 schema registry @ localhost:3502
 * 
 * @author hameetepa
 *
 */
public class JavaAdapterIT {

	private static CISAdapter adapter;

	private CountDownLatch lock;

	private List<IndexedRecord> receivedRecords;

	@BeforeClass
	public static void setup() {
		// override client ID
		ClientProperties.getInstance().setProperty(ClientProperties.CLIENT_ID, "testProducer");
		ConsumerProperties.getInstance(false).setProperty(ConsumerProperties.AUTO_OFFSET_RESET, "latest");
		adapter = CISAdapter.getInstance();
	}

	@Before
	public void setupTest() {
		receivedRecords = new LinkedList<>();
	}

	/**
	 * Tests whether own Heartbeat messages are received and if the update time is
	 * OK.
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void whenConnected_thenHeartbeatsAreSent() throws InterruptedException {
		lock = new CountDownLatch(3);
		adapter.addCallback(new IAdaptorCallback() {
			@Override
			public void messageReceived(IndexedRecord key, IndexedRecord message) {
				receivedRecords.add(message);
				lock.countDown();
			}
		}, TopicConstants.HEARTBEAT_TOPIC);

		// in 15000 ms we should've sent 3 heartbeats plus 3 times 500ms to allow some
		// delay
		lock.await(16500, TimeUnit.MILLISECONDS);

		assertTrue("At least 3 heartbeats should have been received but was " + receivedRecords.size(),
				receivedRecords.size() > 2);

		// check the last 2 of the 3 heartbeats because first heartbeat timing is not
		// acccurate due to thread startup
		Heartbeat hb1 = indexedRecordToHeartbeat(receivedRecords.get(1));
		Heartbeat hb2 = indexedRecordToHeartbeat(receivedRecords.get(2));
		assertEquals(hb1.getId().toString(), "testProducer");
		assertEquals(hb2.getId().toString(), "testProducer");

		long diff = hb2.getAlive() - hb1.getAlive();
		assertTrue("Heartbeat updates should be 5000ms apart (allowing 10% deviation), but was " + diff, diff <= 5500);
	}

	/**
	 * Tests Sending and Receiving of own CAP Alert message.
	 * 
	 * @throws InterruptedException
	 * @throws CommunicationException
	 */
	@Test
	public void whenSendingCAP_thenCAPisReceived() throws InterruptedException, CommunicationException {
		lock = new CountDownLatch(1);
		adapter.addCallback(new IAdaptorCallback() {
			@Override
			public void messageReceived(IndexedRecord key, IndexedRecord message) {
				receivedRecords.add(message);
				lock.countDown();
			}
		}, TopicConstants.STANDARD_TOPIC_CAP);

		Alert testCAP = new Alert();
		testCAP.setSender("testSender");
		testCAP.setIdentifier("testIdentifier");
		testCAP.setSent("testSent");
		testCAP.setStatus(Status.Test);
		testCAP.setMsgType(MsgType.Alert);
		testCAP.setSource("testSource");
		testCAP.setScope(Scope.Private);
		testCAP.setRestriction("testRestriction");
		testCAP.setAddresses("none");
		testCAP.setCode("testCode");
		testCAP.setNote("testNote");
		testCAP.setReferences("testReferences");
		testCAP.setIncidents("testIncidents");
		testCAP.setInfo(null);
		adapter.sendMessage(testCAP);

		// allow 5000 ms for startup and delivery of msg
		lock.await(5000, TimeUnit.MILLISECONDS);

		assertTrue("Own CAP message should be received", receivedRecords.size() == 1);
	}

	private Heartbeat indexedRecordToHeartbeat(IndexedRecord msg) {
		return ((Heartbeat) SpecificData.get().deepCopy(Heartbeat.SCHEMA$, msg));
	}

}