package ccau.kafka.sample;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KafkaService {
//	@Autowired
//	private KafkaConsumer consumer;
////
	@Autowired
	private KafkaProducer kafkaProducer;
	
	@PostConstruct
	public void init() {
		kafkaProducer.produce("parking_information", "test");
	}
}
