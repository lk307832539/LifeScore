package com.entity.base;

import com.entity.Product;
import com.entity.User;

import java.sql.Timestamp;

/**
 * AbstractExchangeItem entity provides the base persistence definition of the
 * ExchangeItem entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractExchangeItem implements java.io.Serializable {

	// Fields

	private Integer exchangeItemId;
	private Product product;
	private User user;
	private Timestamp exchangeTime;

	// Constructors

	/** default constructor */
	public AbstractExchangeItem() {
	}

	/** full constructor */
	public AbstractExchangeItem(Product product, User user, Timestamp exchangeTime) {
		this.product = product;
		this.user = user;
		this.exchangeTime = exchangeTime;
	}

	// Property accessors

	public Integer getExchangeItemId() {
		return this.exchangeItemId;
	}

	public void setExchangeItemId(Integer exchangeItemId) {
		this.exchangeItemId = exchangeItemId;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Timestamp getExchangeTime() {
		return this.exchangeTime;
	}

	public void setExchangeTime(Timestamp exchangeTime) {
		this.exchangeTime = exchangeTime;
	}

}