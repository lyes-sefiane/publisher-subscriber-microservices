package com.lsefiane.publiser.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lsefiane.common.entities.Message;
import com.lsefiane.publiser.converter.DtoToEntityConverter;
import com.lsefiane.publiser.dto.MessageDto;
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

	@Autowired
	private DtoToEntityConverter converter;

	public Message sendMessageToVirtualTopic(MessageDto messageDto) {
		var message = converter.convert(messageDto);
		jmsSender.sendMessageToVirtualTopic(message);
		return message;
	}

	public Message sendMessageToQueue(MessageDto messageDto) {
		var message = converter.convert(messageDto);
		jmsSender.sendMessageToQueue(message);
		return message;
	}

	public Message sendMessageToTopic(MessageDto messageDto) {
		var message = converter.convert(messageDto);
		jmsSender.sendMessageToTopic(message);
		return message;
	}
}
