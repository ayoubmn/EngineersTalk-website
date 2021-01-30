package com.engineerstalk.ws.ui.model.response;

import java.sql.Date;

public class PostRest {
	private String userID;
	private String text;
	private Date date;

	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
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
