package ccau.kafka.sample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	private final static String topic = "parking_information";

	@KafkaListener(topics = topic)
	public void listen(String message) {
		System.out.println(message);
	}
}
