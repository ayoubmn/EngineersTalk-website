package com.engineerstalk.ws.ui.model.request;


public class CommentDetailsRequestModel {
	private String userId;	
	private long id_post;
	private String text;
	
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public long getId_post() {
		return id_post;
	}
	public void setId_post(long id_post) {
		this.id_post = id_post;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
