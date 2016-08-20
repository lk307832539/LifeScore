package com.entity;

import com.entity.base.AbstractProductType;

/**
 * ProductType entity. @author MyEclipse Persistence Tools
 */
public class ProductType extends AbstractProductType implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ProductType() {
	}

	/** full constructor */
	public ProductType(User user, String productTypeName, String productTypeDescription, String productTypeImg) {
		super(user, productTypeName, productTypeDescription, productTypeImg);
	}

}
