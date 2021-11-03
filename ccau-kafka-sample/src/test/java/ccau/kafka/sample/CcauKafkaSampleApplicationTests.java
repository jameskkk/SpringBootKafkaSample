package ccau.kafka.sample;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.Future;

import org.apache.kafka.clients.producer.MockProducer;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.serialization.StringSerializer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CcauKafkaSampleApplicationTests {

	@Test
	void contextLoads() {
		MockProducer<String, String> mockProducer = new MockProducer<>(true, new StringSerializer(), new StringSerializer());

		KafkaProducerTest kafkaProducer = new KafkaProducerTest(mockProducer);
	    Future<RecordMetadata> recordMetadataFuture = kafkaProducer.send("parking_information", "test");
	    
	    assertTrue(mockProducer.history().size() == 1);
	}
}
