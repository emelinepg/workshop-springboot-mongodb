package com.devnoir.workshopmongo.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Comment implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private String text;
	private Date date;
	
	private Post post;
	
	private User author;
	
	public Comment() {
	}

	public Comment(String id, String text, Date date, Post post, User author) {
		super();
		this.id = id;
		this.text = text;
		this.date = date;
		this.post = post;
		this.author = author;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comment other = (Comment) obj;
		return Objects.equals(id, other.id);
	}
}
