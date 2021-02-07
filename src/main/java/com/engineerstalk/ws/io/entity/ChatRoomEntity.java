package com.engineerstalk.ws.io.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity(name="chatRoom")
public class ChatRoomEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8080681141475313794L;

	@Id
	@GeneratedValue
	private long id;
	
	@Column(nullable=false)
	private ArrayList<String> users;
	
	
	
	@Column(nullable=true)
    @OneToMany(mappedBy = "room", fetch = FetchType.LAZY,
    cascade = CascadeType.ALL)
	private Set<MessageEntity> messages;

	
	


	public Set<MessageEntity> getMessages() {
		return messages;
	}


	public void setMessages(Set<MessageEntity> messages) {
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
