package com.InventoryManagement.entities;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ORDERITEMS")
public class OrderItems {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private Date date;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private OrderDetails orderDetails;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Product product;
	
	public OrderDetails getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(OrderDetails orderDetails) {
		this.orderDetails = orderDetails;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	@Override
	public String toString() {
		return "OrderItems [id=" + id + ", date=" + date + ", orderDetails=" + orderDetails + ", product=" + product
				+ "]";
	}
	
	
	
}
