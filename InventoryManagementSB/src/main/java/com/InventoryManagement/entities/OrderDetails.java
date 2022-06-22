package com.InventoryManagement.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ORDERDETAILS")
public class OrderDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int total;
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="orderDetails")
	private List<OrderItems> orderItems = new ArrayList<>();
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private User user;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private PaymentDetails paymentDetails;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	public List<OrderItems> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItems> orderItems) {
		this.orderItems = orderItems;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public PaymentDetails getPaymentDetails() {
		return paymentDetails;
	}

	public void setPaymentDetails(PaymentDetails paymentDetails) {
		this.paymentDetails = paymentDetails;
	}
	
	
	
}
