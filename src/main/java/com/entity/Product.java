package com.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by LK on 2016/8/15.
 */
@Entity
public class Product {
    private int productId;
    private Integer productTypeId;
    private String productName;
    private Integer productScore;
    private String productDescription;
    private Byte exchangeType;
    private Integer userId;
    private String productImg;
    private Collection<ExchangeItem> exchangeItemsByProductId;
    private User userByUserId;

    @Id
    @Column(name = "product_id", nullable = false)
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "product_type_id", nullable = true)
    public Integer getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(Integer productTypeId) {
        this.productTypeId = productTypeId;
    }

    @Basic
    @Column(name = "product_name", nullable = true, length = 255)
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "product_score", nullable = true)
    public Integer getProductScore() {
        return productScore;
    }

    public void setProductScore(Integer productScore) {
        this.productScore = productScore;
    }

    @Basic
    @Column(name = "product_description", nullable = true, length = 255)
    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    @Basic
    @Column(name = "exchange_type", nullable = true)
    public Byte getExchangeType() {
        return exchangeType;
    }

    public void setExchangeType(Byte exchangeType) {
        this.exchangeType = exchangeType;
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
    @Column(name = "product_img", nullable = true, length = 255)
    public String getProductImg() {
        return productImg;
    }

    public void setProductImg(String productImg) {
        this.productImg = productImg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (productId != product.productId) return false;
        if (productTypeId != null ? !productTypeId.equals(product.productTypeId) : product.productTypeId != null)
            return false;
        if (productName != null ? !productName.equals(product.productName) : product.productName != null) return false;
        if (productScore != null ? !productScore.equals(product.productScore) : product.productScore != null)
            return false;
        if (productDescription != null ? !productDescription.equals(product.productDescription) : product.productDescription != null)
            return false;
        if (exchangeType != null ? !exchangeType.equals(product.exchangeType) : product.exchangeType != null)
            return false;
        if (userId != null ? !userId.equals(product.userId) : product.userId != null) return false;
        if (productImg != null ? !productImg.equals(product.productImg) : product.productImg != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productId;
        result = 31 * result + (productTypeId != null ? productTypeId.hashCode() : 0);
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (productScore != null ? productScore.hashCode() : 0);
        result = 31 * result + (productDescription != null ? productDescription.hashCode() : 0);
        result = 31 * result + (exchangeType != null ? exchangeType.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (productImg != null ? productImg.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "productByExchangeProductId")
    public Collection<ExchangeItem> getExchangeItemsByProductId() {
        return exchangeItemsByProductId;
    }

    public void setExchangeItemsByProductId(Collection<ExchangeItem> exchangeItemsByProductId) {
        this.exchangeItemsByProductId = exchangeItemsByProductId;
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
