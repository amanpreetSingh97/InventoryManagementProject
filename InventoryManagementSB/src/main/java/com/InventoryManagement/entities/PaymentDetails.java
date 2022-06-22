package com.InventoryManagement.entities;

import java.sql.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="PAYMENTDETAILS")
public class PaymentDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int amount;
	private Date date;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private OrderDetails orderDetails;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public OrderDetails getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(OrderDetails orderDetails) {
		this.orderDetails = orderDetails;
	}

	@Override
	public String toString() {
		return "PaymentDetails [id=" + id + ", amount=" + amount + ", date=" + date + ", orderDetails=" + orderDetails
				+ "]";
	}
	
}
