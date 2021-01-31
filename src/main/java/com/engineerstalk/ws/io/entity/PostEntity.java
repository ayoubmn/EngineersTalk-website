package com.engineerstalk.ws.io.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="post")
public class PostEntity implements Serializable{
	private static final long serialVersionUID = 8005593197198689977L;
	@Id
	@GeneratedValue
	private long idPost;
	
	@Column(nullable=false)
	private String userId;
	

	@Column(nullable=false)
	private String text;
	
	@Column(nullable=false)
	private Date date;

	
	@Column(nullable=true)
    @OneToMany(mappedBy = "post", fetch = FetchType.LAZY,
    cascade = CascadeType.ALL)
	private Set<CommentEntity> comments;

	


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
