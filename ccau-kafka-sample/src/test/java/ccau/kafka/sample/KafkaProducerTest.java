package ccau.kafka.sample;

import java.util.concurrent.Future;

import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

public class KafkaProducerTest {

	 private final Producer<String, String> producer;

	    public KafkaProducerTest(Producer<String, String> producer) {
	        this.producer = producer;
	    }

	    public Future<RecordMetadata> send(String key, String value) {
	        ProducerRecord<String, String> record = new ProducerRecord<String, String>("topic_sports_news", key, value);
	        return producer.send(record);
	    }
}
