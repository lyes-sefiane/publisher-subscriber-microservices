package com.lsefiane.subscriber.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.lsefiane.common.entities.Order;
import com.lsefiane.common.enums.MessageStatus;
import com.lsefiane.subscriber.service.SubscriberService;

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

	@Autowired
	private SubscriberService subscriberService;

	private static final String RECEIVED = "Received : {}";

	@JmsListener(destination = "${activemq.consumer.virtual.topic.order}", containerFactory = "jmsListenerContainerQueue")
	public void receiveMessageVirtualTopic(@Payload Order order, //
			@Header(name = "messageStatus") String messageStatus) {

		log.info(RECEIVED, order.toString());

		var messageStatusEnum = MessageStatus.getEnumByValue(messageStatus);

		subscriberService.processOrder(order, messageStatusEnum);
	}

}
