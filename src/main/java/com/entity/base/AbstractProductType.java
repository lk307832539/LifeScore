package com.entity.base;

import com.entity.User;

/**
 * AbstractProductType entity provides the base persistence definition of the
 * ProductType entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractProductType implements java.io.Serializable {

	// Fields

	private Integer productTypeId;
	private User user;
	private String productTypeName;
	private String productTypeDescription;
	private String productTypeImg;

	// Constructors

	/** default constructor */
	public AbstractProductType() {
	}

	/** full constructor */
	public AbstractProductType(User user, String productTypeName, String productTypeDescription,
			String productTypeImg) {
		this.user = user;
		this.productTypeName = productTypeName;
		this.productTypeDescription = productTypeDescription;
		this.productTypeImg = productTypeImg;
	}

	// Property accessors

	public Integer getProductTypeId() {
		return this.productTypeId;
	}

	public void setProductTypeId(Integer productTypeId) {
		this.productTypeId = productTypeId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getProductTypeName() {
		return this.productTypeName;
	}

	public void setProductTypeName(String productTypeName) {
		this.productTypeName = productTypeName;
	}

	public String getProductTypeDescription() {
		return this.productTypeDescription;
	}

	public void setProductTypeDescription(String productTypeDescription) {
		this.productTypeDescription = productTypeDescription;
	}

	public String getProductTypeImg() {
		return this.productTypeImg;
	}

	public void setProductTypeImg(String productTypeImg) {
		this.productTypeImg = productTypeImg;
	}

}