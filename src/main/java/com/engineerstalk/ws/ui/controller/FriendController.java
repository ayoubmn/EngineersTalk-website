package com.engineerstalk.ws.ui.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.engineerstalk.ws.service.ChatRoomService;
import com.engineerstalk.ws.shared.dto.ChatRoomDto;
import com.engineerstalk.ws.ui.model.request.FriendAddDetailsRequestModel;

@RestController
@RequestMapping("add") // http://localhost:8081/add
public class FriendController {
	
	@Autowired ChatRoomService chatRoomService;

	
	
	@GetMapping
	public String getFriend() {
		return "get Friend was called";
	}
	@PostMapping
	public void createFriend(@RequestBody FriendAddDetailsRequestModel friendAddDetails) {
	
		ChatRoomDto chatRoomDto=new  ChatRoomDto();
		chatRoomDto.addUser(friendAddDetails.getSender());
		chatRoomDto.addUser(friendAddDetails.getRecipient());

		chatRoomService.createChatRoom(chatRoomDto);

		
	}
	@PutMapping
	public String updateFriend(){
		return "update Friend was called";
	}
	@DeleteMapping
	public String deleteFriend(){
		return "delete Friend was called";
	}
}
