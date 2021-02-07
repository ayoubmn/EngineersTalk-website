package com.engineerstalk.ws.service.impl;

import java.util.Date;
import java.util.HashSet;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.engineerstalk.ws.io.entity.ChatRoomEntity;
import com.engineerstalk.ws.io.entity.MessageEntity;
import com.engineerstalk.ws.io.entity.UserEntity;
import com.engineerstalk.ws.io.repositories.MessageRepository;
import com.engineerstalk.ws.service.ChatRoomService;
import com.engineerstalk.ws.service.MessageService;
import com.engineerstalk.ws.service.UserService;
import com.engineerstalk.ws.shared.dto.ChatRoomDto;
import com.engineerstalk.ws.shared.dto.MessageDto;
import com.engineerstalk.ws.shared.dto.UserDto;

@Service
public class MessageServiceImpl implements MessageService{

	@Autowired ChatRoomService chatRoomService;
	@Autowired UserService userService;

	@Autowired MessageRepository messageRepository;
	
	@Override
	public MessageDto getMessageDto(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MessageDto createMessageDto(MessageDto messageDto) {
		
		MessageEntity messageEntity= new MessageEntity();
		messageEntity.setContent(messageDto.getContent());

		//room
		ChatRoomDto chatRoomDto =chatRoomService.getChatRoom(messageDto.getRoom());
		ChatRoomEntity chatRoomEntity=new ChatRoomEntity();
		chatRoomEntity.setUsers(chatRoomDto.getUsers());
		chatRoomEntity.setMessages(new HashSet<MessageEntity>(chatRoomDto.getMessages()));

		messageEntity.setRoom(chatRoomEntity);

		//sender
		UserDto userDto =userService.getUserById(messageDto.getSender());

		UserEntity userEntity=new UserEntity();
		BeanUtils.copyProperties(userDto, userEntity);

		messageEntity.setSender(userEntity);
		messageEntity.setTimestamp(new Date());
		MessageEntity storedMessagedetails=messageRepository.save(messageEntity);

		return messageDto;
	}

}
