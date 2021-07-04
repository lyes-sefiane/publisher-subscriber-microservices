package com.lsefiane.publisher.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lsefiane.common.entities.Order;
import com.lsefiane.publisher.converter.DtoToEntityConverter;
import com.lsefiane.publisher.dto.OrderDto;
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

	public Order sendMessageToVirtualTopic(OrderDto orderDto) {
		var order = converter.convert(orderDto);
		jmsSender.sendMessageToVirtualTopic(order);
		return order;
	}
}
