package com.lsefiane.publiser.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lsefiane.common.entities.Message;
import com.lsefiane.publiser.jms.JmsSender;

/**
 * 
 * PublisherService.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Jun. 26, 2021
 *
 */
@Service
public class PublisherService {

	@Autowired
	private JmsSender jmsSender;

	public void sendMessageToVirtualTopic(String messageBody) {
		jmsSender.sendMessageToVirtualTopic(new Message(messageBody));
	}

	public void sendMessageToQueue(String messageBody) {
		jmsSender.sendMessageToQueue(new Message(messageBody));
	}

	public void sendMessageToTopic(String messageBody) {
		jmsSender.sendMessageToTopic(new Message(messageBody));
	}
}
