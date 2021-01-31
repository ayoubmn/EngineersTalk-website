package com.engineerstalk.ws.shared.dto;

import java.io.Serializable;
import java.util.Date;


public class CommentDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7078649951030060476L;
	
	private long id;
	private String userId;
	private long id_post;
	private String text;
	private Date date;


	public long getId_post() {
		return id_post;
	}

	public void setId_post(long id_post) {
		this.id_post = id_post;
	}

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
