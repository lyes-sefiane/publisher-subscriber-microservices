package com.lsefiane.common.enums;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 
 * MessageStatus.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Jul. 3, 2021
 *
 */
public enum MessageStatus {
	
	NEW("Create"), //
	UPDATE("Update"),//
	DELETE("Delete");
	
	private static final Map<String, MessageStatus> mapOfEnumsByValue = Arrays.stream(MessageStatus.values()).collect(Collectors.toMap(entry -> entry.value, entry -> entry));
	
	private final String value;

	MessageStatus(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
	/**
	 * Get Enum By Value
	 * 
	 * @param value
	 * @return MessageStatus
	 */
    public static MessageStatus getEnumByValue(String value) {
    	
        if (value == null) {
            throw new IllegalArgumentException(value);
        }

        final MessageStatus result = mapOfEnumsByValue.get(value);

        if (result == null) {
            throw new IllegalArgumentException(value);
        }
        return result;
    }
}
