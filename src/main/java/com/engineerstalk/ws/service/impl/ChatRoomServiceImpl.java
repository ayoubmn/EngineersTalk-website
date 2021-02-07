package com.engineerstalk.ws.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.engineerstalk.ws.io.entity.ChatRoomEntity;
import com.engineerstalk.ws.io.entity.UserEntity;
import com.engineerstalk.ws.io.repositories.ChatRoomRepository;
import com.engineerstalk.ws.service.ChatRoomService;
import com.engineerstalk.ws.shared.dto.ChatRoomDto;
import com.engineerstalk.ws.shared.dto.UserDto;

@Service
public class ChatRoomServiceImpl implements ChatRoomService {

	@Autowired ChatRoomRepository chatRoomRepository;
	
	@Override
	public ChatRoomDto getChatRoom(String id) {
		ChatRoomEntity chatRoomEntity=	chatRoomRepository.findById(Long.parseLong(id));		
		ChatRoomDto returnValue=new ChatRoomDto();
		BeanUtils.copyProperties(chatRoomEntity, returnValue);
		return returnValue;
	}

	@Override
	public ChatRoomDto createChatRoom(ChatRoomDto chatRoomDto) {
		
		ChatRoomEntity myRoom= new ChatRoomEntity();
		BeanUtils.copyProperties(chatRoomDto, myRoom);
		ChatRoomEntity storedChatRoomEntity=chatRoomRepository.save(myRoom);

		return chatRoomDto;
	}

}
