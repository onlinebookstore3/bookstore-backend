package com.cg.bookstore.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="USER")
public class User {
	@Id
	@GeneratedValue
	private Long userId;
	@NotEmpty
	@Size(min = 3, message = "Length must be more than 3")
	@Column(name="password")
	private String password;
	@Column(name="name")
	private String name;
	@NotEmpty
	@Column(name="email")
	private String email;
	@Column(name="address")
	private String address;
	@Column(name="nick_name")
	private String nickName;
	@Column(name="avatar", length = 1000)
	private String avatar;
	@Column(name="shipping_address1")
	private String shippingAddress1;
	@Column(name="shipping_address2")
	private String shippingAddress2;
	@Column(name="phone")
	private int phone;
	@OneToMany
    @JsonIgnore
    private List<OrderDetails> orderDetails;
	@OneToMany
	@JsonIgnore
	private List<Feedback> feedback;
	@OneToMany
	@JsonIgnore
	private List<ShoppingCart> shoppingCart;
	@OneToMany
	@JsonIgnore
	private List<PaymentDetails> paymentDetails;
	
	
	public List<OrderDetails> getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(List<OrderDetails> orderDetails) {
		this.orderDetails = orderDetails;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getShippingAddress1() {
		return shippingAddress1;
	}
	public void setShippingAddress1(String shippingAddress1) {
		this.shippingAddress1 = shippingAddress1;
	}
	public String getShippingAddress2() {
		return shippingAddress2;
	}
	public void setShippingAddress2(String shippingAddress2) {
		this.shippingAddress2 = shippingAddress2;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
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
	public List<PaymentDetails> getPaymentDetails() {
		return paymentDetails;
	}
	public void setPaymentDetails(List<PaymentDetails> paymentDetails) {
		this.paymentDetails = paymentDetails;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", name=" + name + ", email=" + email
				+ ", address=" + address + ", nickName=" + nickName + ", avatar=" + avatar + ", shippingAddress1="
				+ shippingAddress1 + ", shippingAddress2=" + shippingAddress2 + ", phone=" + phone + ", orderDetails="
				+ orderDetails + ", feedback=" + feedback + ", shoppingCart=" + shoppingCart + ", paymentDetails="
				+ paymentDetails + "]";
	}
	

}
