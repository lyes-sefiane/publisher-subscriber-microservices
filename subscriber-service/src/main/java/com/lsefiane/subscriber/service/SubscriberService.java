package com.lsefiane.subscriber.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lsefiane.common.entities.Order;
import com.lsefiane.common.enums.MessageStatus;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * SubscriberService.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Jul. 4, 2021
 *
 */
@Slf4j
@Service
public class SubscriberService {

	@Transactional
	public void processOrder(Order order, MessageStatus messageStatusEnum) {
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
			throw new UnsupportedOperationException(
					"Unsupported Operation Order ! Status : " + messageStatusEnum.getValue());
		}
	}

}
