package com.entity;

import javax.persistence.*;

/**
 * Created by LK on 2016/8/15.
 */
@Entity
@Table(name = "product_type", schema = "lifescore", catalog = "")
public class ProductType {
    private int productTypeId;
    private String productTypeName;
    private String productTypeDescription;
    private Integer userId;
    private String productTypeImg;
    private User userByUserId;

    @Id
    @Column(name = "product_type_id", nullable = false)
    public int getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(int productTypeId) {
        this.productTypeId = productTypeId;
    }

    @Basic
    @Column(name = "product_type_name", nullable = true, length = 255)
    public String getProductTypeName() {
        return productTypeName;
    }

    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName;
    }

    @Basic
    @Column(name = "product_type_description", nullable = true, length = 255)
    public String getProductTypeDescription() {
        return productTypeDescription;
    }

    public void setProductTypeDescription(String productTypeDescription) {
        this.productTypeDescription = productTypeDescription;
    }

    @Basic
    @Column(name = "user_id", nullable = true)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "product_type_img", nullable = true, length = 255)
    public String getProductTypeImg() {
        return productTypeImg;
    }

    public void setProductTypeImg(String productTypeImg) {
        this.productTypeImg = productTypeImg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductType that = (ProductType) o;

        if (productTypeId != that.productTypeId) return false;
        if (productTypeName != null ? !productTypeName.equals(that.productTypeName) : that.productTypeName != null)
            return false;
        if (productTypeDescription != null ? !productTypeDescription.equals(that.productTypeDescription) : that.productTypeDescription != null)
            return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (productTypeImg != null ? !productTypeImg.equals(that.productTypeImg) : that.productTypeImg != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productTypeId;
        result = 31 * result + (productTypeName != null ? productTypeName.hashCode() : 0);
        result = 31 * result + (productTypeDescription != null ? productTypeDescription.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (productTypeImg != null ? productTypeImg.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    public User getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(User userByUserId) {
        this.userByUserId = userByUserId;
    }
}
