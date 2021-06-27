package com.lsefiane.publisher.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lsefiane.common.entities.Message;
import com.lsefiane.publisher.converter.DtoToEntityConverter;
import com.lsefiane.publisher.dto.MessageDto;
import com.lsefiane.publisher.jms.JmsSender;

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
}
