package com.engineerstalk.ws.io.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity(name="message")

public class MessageEntity implements Serializable{
	   /**
	 * 
	 */
	private static final long serialVersionUID = 1359573284969185974L;
	
	@Id
	@GeneratedValue
	private long messageid;
	
	
    public long getMessageid() {
		return messageid;
	}


	public void setMessageid(long messageid) {
		this.messageid = messageid;
	}


	@ManyToOne(fetch = FetchType.LAZY,cascade=CascadeType.ALL, optional = false)
    @JoinColumn(name = "id", nullable = false)
    private ChatRoomEntity room;

	
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "userId", nullable = false)
    private UserEntity sender;
	
	
	@Column(nullable=false)
	private String content;
	

	@Column(nullable=false)
	private Date timestamp;







	public ChatRoomEntity getRoom() {
		return room;
	}


	public void setRoom(ChatRoomEntity room) {
		this.room = room;
	}


	public UserEntity getSender() {
		return sender;
	}


	public void setSender(UserEntity sender) {
		this.sender = sender;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public Date getTimestamp() {
		return timestamp;
	}


	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}





}