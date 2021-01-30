package com.engineerstalk.ws.shared.dto;

import java.io.Serializable;
import java.util.Date;

public class PostDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2490231221527938669L;

	private long id;
    private String userId;
	private String text;
	private Date date;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	
}
