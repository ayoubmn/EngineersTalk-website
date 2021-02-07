package com.engineerstalk.ws.service;

import com.engineerstalk.ws.shared.dto.ChatRoomDto;

public interface ChatRoomService {
	ChatRoomDto getChatRoom(String id);
	ChatRoomDto createChatRoom(ChatRoomDto chatRoomDto);

}
