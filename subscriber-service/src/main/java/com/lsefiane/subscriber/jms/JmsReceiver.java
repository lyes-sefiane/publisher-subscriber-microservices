package com.lsefiane.subscriber.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.lsefiane.common.entities.Message;

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
	public void receiveMessageVirtualTopic(Message message) {
		log.info(RECEIVED, message.toString());
	}

}
