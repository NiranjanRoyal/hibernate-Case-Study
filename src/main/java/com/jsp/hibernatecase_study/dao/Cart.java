package com.jsp.hibernatecase_study.dao;

import java.util.List;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Entity;

@Entity
public class Cart {
	@Id
	private int cartId;
	@OneToMany
	private List<Product> productls;
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public List<Product> getProductls() {
		return productls;
	}
	public void setProductls(List<Product> productls) {
		this.productls = productls;
	}
	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", productls=" + productls + "]";
	}

}
