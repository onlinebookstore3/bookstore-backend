package com.cg.bookstore.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="FEEDBACK")

public class Feedback {
   @Id
   @GeneratedValue
	private Long feedId;
	@Column(name="rating")
	private String rating;
	@Column(name="comments")
	private String comments;
	
	@ManyToOne 
	private BookDetails bookDetails; 
	@ManyToOne 
	private User users;
	
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public BookDetails getBookDetails() {
		return bookDetails;
	}
	public void setBookDetails(BookDetails bookDetails) {
		this.bookDetails = bookDetails;
	}
	public User getUsers() {
		return users;
	}
	public void setUsers(User users) {
		this.users = users;
	}
	@Override
	public String toString() {
		return "Feedback [rating=" + rating + ", comments=" + comments + ", bookDetails=" + bookDetails + ", users="
				+ users + "]";
	}
	
	
	
	
	}
	

