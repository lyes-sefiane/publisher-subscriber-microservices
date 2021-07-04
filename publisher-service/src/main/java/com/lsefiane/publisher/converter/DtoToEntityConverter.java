package com.lsefiane.publisher.converter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.lsefiane.common.entities.Order;
import com.lsefiane.publisher.dto.OrderDto;

/**
 * 
 * DtoToEntityConverter.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Jun. 27, 2021
 *
 */
@Component
public class DtoToEntityConverter implements Converter<OrderDto, Order> {

	@Override
	public Order convert(OrderDto orderDto) {
		return Order.builder()//
				.id(UUID.randomUUID()).description(orderDto.getDescription())//
				.timestamp(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")//
						.format(LocalDateTime.now()))//
				.build();
	}

}
