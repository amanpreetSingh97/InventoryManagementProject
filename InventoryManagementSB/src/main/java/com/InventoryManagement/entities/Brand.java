package com.InventoryManagement.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BRAND")
public class Brand {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;

//	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="brand")
//	@JoinColumn(name = "brand_id")
//	private List<Product> product = new ArrayList<>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	public List<Product> getProduct() {
//		return product;
//	}
//	public void setProduct(List<Product> product) {
//		this.product = product;
//	}
	@Override
	public String toString() {
		return "Brand [id=" + id + ", name=" + name + "]";
	}
	
	
	

}
