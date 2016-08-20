package com.entity;

import com.entity.base.AbstractProduct;

import java.util.Set;

/**
 * Product entity. @author MyEclipse Persistence Tools
 */
public class Product extends AbstractProduct implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Product() {
	}

	/** full constructor */
	public Product(User user, Integer productTypeId, String productName, Integer productScore,
			String productDescription, Short exchangeType, String productImg, Set exchangeItems, Set exchangeItems_1) {
		super(user, productTypeId, productName, productScore, productDescription, exchangeType, productImg,
				exchangeItems, exchangeItems_1);
	}

}
