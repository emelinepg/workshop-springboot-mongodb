package com.devnoir.workshopmongo.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Post implements Serializable {

	private static final long serialVersionUID = 1L;
	private String id;
	private Date date;
	private String title;
	private String body;
	
	private User author;
	
	private Set<Comment> comments = new HashSet<>();
	
	public Post() {
	}

	public Post(String id, Date date, String title, String body, User user) {
		this.id = id;
		this.date = date;
		this.title = title;
		this.body = body;
		this.author = user;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public User getUser() {
		return author;
	}

	public void setUser(User user) {
		this.author = user;
	}

	public User getAuthor() {
		return author;
	}
	
	public Set<Comment> getComments() {
		return comments;
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
		Post other = (Post) obj;
		return Objects.equals(id, other.id);
	}
}
