package com.engineerstalk.ws.shared.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;


public class PostDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2490231221527938669L;

	private long idPost;
    private String userId;
	private String text;
	private Date date;




	public long getIdPost() {
		return idPost;
	}
	public void setIdPost(long idPost) {
		this.idPost = idPost;
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
