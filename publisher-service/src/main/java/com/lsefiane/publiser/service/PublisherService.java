package com.lsefiane.publiser.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
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
@EnableScheduling
@Service
public class PublisherService {

	@Autowired
	private JmsSender jmsSender;

	public void sendMessage(String messageBody) {
		jmsSender.sendMessageToVirtualTopic(new Message(messageBody));
	}
}
