package com.cg.bookstore.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="BOOKDETAILS")
public class BookDetails {
	
	@Id
	@GeneratedValue
	private Long bookId;
	@Column(name="book_name")
	private String bookName;
	
	@Column(name="book_cover",length = 1000)
	private String bookCover;
	@Column(name="author")
	private String author;
	@Column(name="author_bio")
	private String authorBio;
	@Column(name="book_description")
	private String bookDescription;
	@Column(name="genre")
	private String genre;
	@Column(name="publisher")
	private String publisher;
	@JsonFormat(pattern="yyyy-MM-dd")
	@Column(name="release_date")
	private Date releaseDate;
	@Column(name="price")
	private double price;
	
	
	
	@OneToMany
	@JsonIgnore
	private List<Feedback> feedback;
	@OneToMany
	@JsonIgnore
	private List<OrderDetails> orderDetails;
	@OneToMany
	@JsonIgnore
	private List<ShoppingCart> shoppingCart;
	
	public List<OrderDetails> getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(List<OrderDetails> orderDetails) {
		this.orderDetails = orderDetails;
	}
	public Long getBookId() {
		return bookId;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookCover() {
		return bookCover;
	}
	public void setBookCover(String bookCover) {
		this.bookCover = bookCover;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthorBio() {
		return authorBio;
	}
	public void setAuthorBio(String authorBio) {
		this.authorBio = authorBio;
	}
	public String getBookDescription() {
		return bookDescription;
	}
	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public List<Feedback> getFeedback() {
		return feedback;
	}
	public void setFeedback(List<Feedback> feedback) {
		this.feedback = feedback;
	}
	public List<ShoppingCart> getShoppingCart() {
		return shoppingCart;
	}
	public void setShoppingCart(List<ShoppingCart> shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "BookDetails [bookId=" + bookId + ", bookName=" + bookName + ", bookCover=" + bookCover + ", author="
				+ author + ", authorBio=" + authorBio + ", bookDescription=" + bookDescription + ", genre=" + genre
				+ ", publisher=" + publisher + ", releaseDate=" + releaseDate + ", feedback=" + feedback
				+ ", orderDetails=" + orderDetails + ", shoppingCart=" + shoppingCart + "]";
	}
	
	
	
	}
	
	
	
	


