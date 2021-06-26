package com.lsefiane.publiser.jms;

import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.lsefiane.common.entities.Message;

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

	@Autowired
	private JmsTemplate jmsTemplate;

	@Value("${activemq.virtual.topic.message}")
	private String virtualTopicMessage;

	public void sendMessageToVirtualTopic(Message message) {
		log.info("Sending : " + message + " to : " + virtualTopicMessage);
		jmsTemplate.convertAndSend(new ActiveMQTopic(virtualTopicMessage), message);
	}
}
