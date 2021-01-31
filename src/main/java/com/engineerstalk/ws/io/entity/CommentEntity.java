package com.engineerstalk.ws.io.entity;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="comment")
public class CommentEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6905893938693698323L;
	@Id
	@GeneratedValue
	private long id;
	
	@Column(nullable=false)
	private String userId;
	
	
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idPost", nullable = false)
    private PostEntity post;

	
	

	public PostEntity getPost() {
		return post;
	}

	public void setPost(PostEntity post) {
		this.post = post;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

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
