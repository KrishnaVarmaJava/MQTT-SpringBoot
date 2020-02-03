package RabbiMQ.TestApp.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQSender {

	@Autowired
	RabbitTemplate rabbitTemplate;

	@Scheduled(fixedRate = 10000)
	public void SendMessage(){
		System.out.println("Sending message...");
		rabbitTemplate.convertAndSend("ROVERHUB", "Hello from RabbitMQ!");
	}

}
