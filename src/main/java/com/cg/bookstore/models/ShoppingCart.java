package com.cg.bookstore.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="SHOPPINGCART")
public class ShoppingCart {
	@Id
	@GeneratedValue
	private Long cartId;
	@Column(name="total_amount")
	private double totalAmount;
	@Column(name="sub_total")
	private double subTotal;
	@NotEmpty
	@Column(name="quantity")
	private int quantity;
	@Column(name="price")
	private double price;
	
	@OneToMany
    @JsonIgnore
    private List<OrderDetails> orderDetails;
	
	@ManyToOne 
	private BookDetails bookDetails;
	
	@ManyToOne 
	private User users;
	
	public Long getCartId() {
		return cartId;
	}
	public void setCartId(Long cartId) {
		this.cartId = cartId;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public double getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public List<OrderDetails> getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(List<OrderDetails> orderDetails) {
		this.orderDetails = orderDetails;
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
		return "ShoppingCart [cartId=" + cartId + ", totalAmount=" + totalAmount + ", subTotal=" + subTotal
				+ ", quantity=" + quantity + ", price=" + price + ", orderDetails=" + orderDetails + ", bookDetails="
				+ bookDetails + ", users=" + users + "]";
	}
	
	
	
}
