package com.engineerstalk.ws.io.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity(name="posts")
public class PostEntity implements Serializable{
	private static final long serialVersionUID = 8005593197198689977L;
	@Id
	@GeneratedValue
	private long id;
	
	@Column(nullable=false)
	private String userId;
	

	@Column(nullable=false)
	private String text;
	
	@Column(nullable=false)
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
