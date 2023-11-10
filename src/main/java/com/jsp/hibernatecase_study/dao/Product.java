package com.jsp.hibernatecase_study.dao;

import javax.persistence.Id;

import javax.persistence.Entity;


@Entity
public class Product {
	@Id
	private int productId;
	private String productName;
	private double productPrice;
	private int productQuality;

	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductQuality() {
		return productQuality;
	}
	public void setProductQuality(int productQuality) {
		this.productQuality = productQuality;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productQuality=" + productQuality + "]";
	}

}
