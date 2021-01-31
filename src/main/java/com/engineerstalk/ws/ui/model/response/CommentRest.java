package com.engineerstalk.ws.ui.model.response;

public class CommentRest {
	private long id;
	private String userId;	
	private String text;
	private long id_post;


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getId_post() {
		return id_post;
	}
	public void setId_post(long id_post) {
		this.id_post = id_post;
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

}
