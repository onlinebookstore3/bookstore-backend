package com.cg.bookstore.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
@Entity
@Table(name="PAYMENTDETAILS")
public class PaymentDetails {
	@Id
	@GeneratedValue
	private Long paymentId;
	@NotEmpty
	@Column(name="card_number")
	private String cardNumber;
	@NotEmpty
	@Column(name="cvv",length=3)
	private int cvv;
	@NotEmpty
	@Column(name="expiry_date")
	private Date expiryDate;
	@NotEmpty
	@Column(name="cardholder_name")
	private String cardHolderName;
	
	@ManyToOne 
	private User users;
	
	public User getUsers() {
		return users;
	}
	public void setUsers(User users) {
		this.users = users;
	}
	public Long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	@Override
	public String toString() {
		return "PaymentDetails [paymentId=" + paymentId + ", cardNumber=" + cardNumber + ", cvv=" + cvv
				+ ", expiryDate=" + expiryDate + ", cardHolderName=" + cardHolderName + ", users=" + users + "]";
	}
	
	
	
}
