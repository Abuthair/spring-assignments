package com.productapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Product {
	@Id
	@Column(name="productid")
	@GeneratedValue (generator = "product_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "product_gen",sequenceName = "product_sequence",allocationSize = 1,initialValue = 1)
private Integer productId;
	@Column(length = 30)
private String name;
	@Column(length = 30)
private String category;
	@Column(length = 40)
private String brand;
	
private double price;
public Integer getProductId() {
	return productId;
}
public void setProductId(Integer productId) {
	this.productId = productId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Product [productId=" + productId + ", name=" + name + ", category=" + category + ", brand=" + brand
			+ ", price=" + price + "]";
}


}
