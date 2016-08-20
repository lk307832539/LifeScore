package com.entity;

import com.entity.base.AbstractExchangeItem;

import java.sql.Timestamp;

/**
 * ExchangeItem entity. @author MyEclipse Persistence Tools
 */
public class ExchangeItem extends AbstractExchangeItem implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ExchangeItem() {
	}

	/** full constructor */
	public ExchangeItem(Product product, User user, Timestamp exchangeTime) {
		super(product, user, exchangeTime);
	}

}
