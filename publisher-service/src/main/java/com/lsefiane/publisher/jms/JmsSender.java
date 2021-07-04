package com.lsefiane.publisher.jms;

import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.lsefiane.common.entities.Order;
import com.lsefiane.common.enums.MessageStatus;
import com.lsefiane.publisher.jms.postprocess.CustomMessagePostProcessor;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * JmsSender.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Jun. 26, 2021
 *
 */
@Slf4j
@Component
public class JmsSender {

	private static final String SENDING_TO = "Sending : {} to : {}";

	@Autowired
	private JmsTemplate jmsTemplate;

	@Value("${activemq.virtual.topic.order}")
	private String virtualTopicOrder;

	public void sendMessageToVirtualTopic(Order order) {
		jmsTemplate.convertAndSend(new ActiveMQTopic(virtualTopicOrder), order, new CustomMessagePostProcessor(MessageStatus.NEW));
		log.info(SENDING_TO, order, virtualTopicOrder);
	}
}
