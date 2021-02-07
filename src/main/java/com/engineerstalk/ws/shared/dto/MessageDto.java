package com.engineerstalk.ws.shared.dto;

import java.io.Serializable;

public class MessageDto implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 933747063660377274L;
	private long messageid;
	private String room;
	private String sender;	
	private String content;	

    public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public long getMessageid() {
		return messageid;
	}
	public void setMessageid(long messageid) {
		this.messageid = messageid;
	}

}
