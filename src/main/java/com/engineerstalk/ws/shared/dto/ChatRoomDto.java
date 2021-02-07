package com.engineerstalk.ws.shared.dto;

import java.io.Serializable;
import java.util.ArrayList;


import com.engineerstalk.ws.io.entity.MessageEntity;

public class ChatRoomDto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5503098696603239661L;

	private long id;
	private ArrayList<String> users=new ArrayList<String>();
	private ArrayList<MessageEntity> messages = new ArrayList<MessageEntity>();

	
	

	public ChatRoomDto() {
		super();
	}

	public ArrayList<MessageEntity> getMessages() {
		return messages;
	}

	public void setMessages(ArrayList<MessageEntity> messages) {
		this.messages = messages;
	}


	public void addMessage(MessageEntity message){
		messages.add(message);
	}
	
	
	public void addUser(String userId){
		users.add(userId);
	}
	
	public void clear(){
		messages.clear();
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public ArrayList<String> getUsers() {
		return users;
	}

	public void setUsers(ArrayList<String> users) {
		this.users = users;
	}

}
