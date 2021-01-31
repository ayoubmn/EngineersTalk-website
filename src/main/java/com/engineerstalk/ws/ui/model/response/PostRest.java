package com.engineerstalk.ws.ui.model.response;

import java.util.Date;


public class PostRest {
	private long idPost;
	private String userId;	



	public long getIdPost() {
		return idPost;
	}
	public void setIdPost(long idPost) {
		this.idPost = idPost;
	}
	private String text;
	private Date date;


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
