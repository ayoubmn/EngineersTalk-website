package com.engineerstalk.ws.service;

import com.engineerstalk.ws.shared.dto.MessageDto;

public interface MessageService {
	MessageDto getMessageDto(String id);
	MessageDto createMessageDto(MessageDto messageDto);

}
