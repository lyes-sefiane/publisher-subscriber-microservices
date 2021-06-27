package com.lsefiane.publiser.converter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.lsefiane.common.entities.Message;
import com.lsefiane.publiser.dto.MessageDto;

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
public class DtoToEntityConverter implements Converter<MessageDto, Message> {

	@Override
	public Message convert(MessageDto messageDto) {
		return Message.builder()//
				.messageBody(messageDto.getMessageBody())//
				.timestamp(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")//
						.format(LocalDateTime.now()))//
				.build();
	}

}
