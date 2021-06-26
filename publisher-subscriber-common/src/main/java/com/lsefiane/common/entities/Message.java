package com.lsefiane.common.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 
 * Message.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Jun. 26, 2021
 *
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Message {

	private String timestamp;
	private String messageBody;

	public Message(String messageBody) {
		this.messageBody = messageBody;
		this.timestamp = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss").format(LocalDateTime.now());
	}

	@Override
	public String toString() {
		return "Message [timestamp=" + timestamp + ", messageBody=" + messageBody + "]";
	}

}
