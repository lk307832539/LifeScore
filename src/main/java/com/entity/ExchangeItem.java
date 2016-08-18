package com.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by LK on 2016/8/15.
 */
@Entity
@Table(name = "exchange_item", schema = "lifescore", catalog = "")
public class ExchangeItem {
    private int exchangeItemId;
    private Integer exchangeProductId;
    private Integer exchangeUserId;
    private Timestamp exchangeTime;
    private Product productByExchangeProductId;
    private User userByExchangeUserId;

    @Id
    @Column(name = "exchange_item_id", nullable = false)
    public int getExchangeItemId() {
        return exchangeItemId;
    }

    public void setExchangeItemId(int exchangeItemId) {
        this.exchangeItemId = exchangeItemId;
    }

    @Basic
    @Column(name = "exchange_product_id", nullable = true)
    public Integer getExchangeProductId() {
        return exchangeProductId;
    }

    public void setExchangeProductId(Integer exchangeProductId) {
        this.exchangeProductId = exchangeProductId;
    }

    @Basic
    @Column(name = "exchange_user_id", nullable = true)
    public Integer getExchangeUserId() {
        return exchangeUserId;
    }

    public void setExchangeUserId(Integer exchangeUserId) {
        this.exchangeUserId = exchangeUserId;
    }

    @Basic
    @Column(name = "exchange_time", nullable = true)
    public Timestamp getExchangeTime() {
        return exchangeTime;
    }

    public void setExchangeTime(Timestamp exchangeTime) {
        this.exchangeTime = exchangeTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExchangeItem that = (ExchangeItem) o;

        if (exchangeItemId != that.exchangeItemId) return false;
        if (exchangeProductId != null ? !exchangeProductId.equals(that.exchangeProductId) : that.exchangeProductId != null)
            return false;
        if (exchangeUserId != null ? !exchangeUserId.equals(that.exchangeUserId) : that.exchangeUserId != null)
            return false;
        if (exchangeTime != null ? !exchangeTime.equals(that.exchangeTime) : that.exchangeTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = exchangeItemId;
        result = 31 * result + (exchangeProductId != null ? exchangeProductId.hashCode() : 0);
        result = 31 * result + (exchangeUserId != null ? exchangeUserId.hashCode() : 0);
        result = 31 * result + (exchangeTime != null ? exchangeTime.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "exchange_product_id", referencedColumnName = "product_id")
    public Product getProductByExchangeProductId() {
        return productByExchangeProductId;
    }

    public void setProductByExchangeProductId(Product productByExchangeProductId) {
        this.productByExchangeProductId = productByExchangeProductId;
    }

    @ManyToOne
    @JoinColumn(name = "exchange_user_id", referencedColumnName = "user_id")
    public User getUserByExchangeUserId() {
        return userByExchangeUserId;
    }

    public void setUserByExchangeUserId(User userByExchangeUserId) {
        this.userByExchangeUserId = userByExchangeUserId;
    }
}
