package com.engineerstalk.ws.ui.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.engineerstalk.ws.io.entity.MessageEntity;
import com.engineerstalk.ws.service.ChatRoomService;
import com.engineerstalk.ws.service.MessageService;
import com.engineerstalk.ws.shared.dto.ChatRoomDto;
import com.engineerstalk.ws.shared.dto.MessageDto;
import com.engineerstalk.ws.ui.model.request.FriendAddDetailsRequestModel;
import com.engineerstalk.ws.ui.model.request.MessageDetailsRequestModel;

@RestController
@RequestMapping("message") // http://localhost:8081/message
public class MessageController {

	//@Autowired private SimpMessagingTemplate simpMessagingTemplate;
	@Autowired MessageService messageService;


	/*@MessageMapping("/chat/{to}")
	public void sendMessage(@DestinationVariable String to,MessageEntity message) {
	System.out.println("handling send message: "+message+" to: "+to);
	simpMessagingTemplate.convertAndSend("/topic/massages/"+to,message);
	
	}
	*/
	
	
	@GetMapping
	public String getMessage() {
		return "get Message was called";
	}
	@PostMapping
	public void createMessage(@RequestBody MessageDetailsRequestModel messageAddDetails) {
		MessageDto messageDto=new  MessageDto();
		BeanUtils.copyProperties(messageAddDetails, messageDto);
		messageService.createMessageDto(messageDto);

		
	}
	@PutMapping
	public String updateMessage(){
		return "update Message was called";
	}
	@DeleteMapping
	public String deleteMessage(){
		return "delete Message was called";
	}
	

}