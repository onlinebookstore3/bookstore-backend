package com.cg.bookstore.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="ORDERDETAILS")
public class OrderDetails {
	@Id
	@GeneratedValue
	private Long orderId;
	@Column(name="book_name")
	private String bookName;
	@Column(name="order_no")
	private Long orderNo;
	@JsonFormat(pattern="yyyy-MM-dd")
	@Column(name="order_date")
	private Date orderDate;
	@Column(name="quantity")
	private int quantity;
	@Column(name="price")
	private double price;
	@Column(name="sub_total")
	private double subTotal;
	@Column(name="total_amount")
	private double totalAmount;
	@Column(name="shipping_address")
	private String shippingAddress;
	
	@ManyToOne
	private User users;
	@ManyToOne
	private BookDetails bookDetails;
	@ManyToOne
	private ShoppingCart shoppingCart;
	
	public BookDetails getBookDetails() {
		return bookDetails;
	}
	public void setBookDetails(BookDetails bookDetails) {
		this.bookDetails = bookDetails;
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
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
	public double getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public User getUsers() {
		return users;
	}
	public void setUsers(User users) {
		this.users = users;
	}
	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}
	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	public Long getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(Long orderNo) {
		this.orderNo = orderNo;
	}
	@Override
	public String toString() {
		return "OrderDetails [orderId=" + orderId + ", bookName=" + bookName + ", orderDate=" + orderDate
				+ ", quantity=" + quantity + ", price=" + price + ", subTotal=" + subTotal + ", totalAmount="
				+ totalAmount + ", shippingAddress=" + shippingAddress + ", users=" + users + ", bookDetails="
				+ bookDetails + ", shoppingCart=" + shoppingCart + "]";
	}
	
	
	
	
	

}
