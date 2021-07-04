package com.lsefiane.subscriber.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.lsefiane.common.entities.Message;
import com.lsefiane.common.enums.MessageStatus;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * JmsReceiver.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Jun. 26, 2021
 *
 */
@Slf4j
@Component
public class JmsReceiver {

	private static final String RECEIVED = "Received : {}";

	@JmsListener(destination = "${activemq.consumer.virtual.topic.message}", containerFactory = "jmsListenerContainerQueue")
	public void receiveMessageVirtualTopic(@Payload Message message,//
			@Header(name = "messageStatus") String messageStatus, //
			MessageHeaders messageHeaders) {

		log.info(RECEIVED, message.toString());

		var messageStatusEnum = MessageStatus.getEnumByValue(messageStatus);

		switch (messageStatusEnum) {
		case NEW:
			log.info("Creation Process invocation...");
			break;
		case UPDATE:
			log.info("Update Process invocation...");
			break;
		case DELETE:
			log.info("Delete Process invocation...");
			break;
		default:
			break;
		}
	}

}
