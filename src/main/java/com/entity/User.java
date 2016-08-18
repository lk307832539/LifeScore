package com.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by LK on 2016/8/15.
 */
@Entity
public class User {
    private int userId;
    private String userName;
    private String nikeName;
    private String email;
    private String password;
    private Timestamp registerTime;
    private String registerIp;
    private Timestamp lastLoginTime;
    private String lastLoginIp;
    private String loginCount;
    private String validateCode;
    private Byte regiestType;
    private Integer score;
    private Collection<DayScoreLog> dayScoreLogsByUserId;
    private Collection<ExchangeItem> exchangeItemsByUserId;
    private Collection<Product> productsByUserId;
    private Collection<ProductType> productTypesByUserId;
    private Collection<Task> tasksByUserId;
    private Collection<TaskType> taskTypesByUserId;
    private Collection<UserExt> userExtsByUserId;

    @Id
    @Column(name = "user_id", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "user_name", nullable = true, length = 255)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "nike_name", nullable = true, length = 255)
    public String getNikeName() {
        return nikeName;
    }

    public void setNikeName(String nikeName) {
        this.nikeName = nikeName;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 255)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "password", nullable = true, length = 255)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "register_time", nullable = true)
    public Timestamp getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Timestamp registerTime) {
        this.registerTime = registerTime;
    }

    @Basic
    @Column(name = "register_ip", nullable = true, length = 255)
    public String getRegisterIp() {
        return registerIp;
    }

    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp;
    }

    @Basic
    @Column(name = "last_login_time", nullable = true)
    public Timestamp getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Timestamp lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    @Basic
    @Column(name = "last_login_ip", nullable = true, length = 255)
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    @Basic
    @Column(name = "login_count", nullable = true, length = 255)
    public String getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(String loginCount) {
        this.loginCount = loginCount;
    }

    @Basic
    @Column(name = "validate_code", nullable = true, length = 255)
    public String getValidateCode() {
        return validateCode;
    }

    public void setValidateCode(String validateCode) {
        this.validateCode = validateCode;
    }

    @Basic
    @Column(name = "regiest_type", nullable = true)
    public Byte getRegiestType() {
        return regiestType;
    }

    public void setRegiestType(Byte regiestType) {
        this.regiestType = regiestType;
    }

    @Basic
    @Column(name = "score", nullable = true)
    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (userId != user.userId) return false;
        if (userName != null ? !userName.equals(user.userName) : user.userName != null) return false;
        if (nikeName != null ? !nikeName.equals(user.nikeName) : user.nikeName != null) return false;
        if (email != null ? !email.equals(user.email) : user.email != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (registerTime != null ? !registerTime.equals(user.registerTime) : user.registerTime != null) return false;
        if (registerIp != null ? !registerIp.equals(user.registerIp) : user.registerIp != null) return false;
        if (lastLoginTime != null ? !lastLoginTime.equals(user.lastLoginTime) : user.lastLoginTime != null)
            return false;
        if (lastLoginIp != null ? !lastLoginIp.equals(user.lastLoginIp) : user.lastLoginIp != null) return false;
        if (loginCount != null ? !loginCount.equals(user.loginCount) : user.loginCount != null) return false;
        if (validateCode != null ? !validateCode.equals(user.validateCode) : user.validateCode != null) return false;
        if (regiestType != null ? !regiestType.equals(user.regiestType) : user.regiestType != null) return false;
        if (score != null ? !score.equals(user.score) : user.score != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (nikeName != null ? nikeName.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (registerTime != null ? registerTime.hashCode() : 0);
        result = 31 * result + (registerIp != null ? registerIp.hashCode() : 0);
        result = 31 * result + (lastLoginTime != null ? lastLoginTime.hashCode() : 0);
        result = 31 * result + (lastLoginIp != null ? lastLoginIp.hashCode() : 0);
        result = 31 * result + (loginCount != null ? loginCount.hashCode() : 0);
        result = 31 * result + (validateCode != null ? validateCode.hashCode() : 0);
        result = 31 * result + (regiestType != null ? regiestType.hashCode() : 0);
        result = 31 * result + (score != null ? score.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "userByUserId")
    public Collection<DayScoreLog> getDayScoreLogsByUserId() {
        return dayScoreLogsByUserId;
    }

    public void setDayScoreLogsByUserId(Collection<DayScoreLog> dayScoreLogsByUserId) {
        this.dayScoreLogsByUserId = dayScoreLogsByUserId;
    }

    @OneToMany(mappedBy = "userByExchangeUserId")
    public Collection<ExchangeItem> getExchangeItemsByUserId() {
        return exchangeItemsByUserId;
    }

    public void setExchangeItemsByUserId(Collection<ExchangeItem> exchangeItemsByUserId) {
        this.exchangeItemsByUserId = exchangeItemsByUserId;
    }

    @OneToMany(mappedBy = "userByUserId")
    public Collection<Product> getProductsByUserId() {
        return productsByUserId;
    }

    public void setProductsByUserId(Collection<Product> productsByUserId) {
        this.productsByUserId = productsByUserId;
    }

    @OneToMany(mappedBy = "userByUserId")
    public Collection<ProductType> getProductTypesByUserId() {
        return productTypesByUserId;
    }

    public void setProductTypesByUserId(Collection<ProductType> productTypesByUserId) {
        this.productTypesByUserId = productTypesByUserId;
    }

    @OneToMany(mappedBy = "userByTaskUserId")
    public Collection<Task> getTasksByUserId() {
        return tasksByUserId;
    }

    public void setTasksByUserId(Collection<Task> tasksByUserId) {
        this.tasksByUserId = tasksByUserId;
    }

    @OneToMany(mappedBy = "userByUserId")
    public Collection<TaskType> getTaskTypesByUserId() {
        return taskTypesByUserId;
    }

    public void setTaskTypesByUserId(Collection<TaskType> taskTypesByUserId) {
        this.taskTypesByUserId = taskTypesByUserId;
    }

    @OneToMany(mappedBy = "userByUserId")
    public Collection<UserExt> getUserExtsByUserId() {
        return userExtsByUserId;
    }

    public void setUserExtsByUserId(Collection<UserExt> userExtsByUserId) {
        this.userExtsByUserId = userExtsByUserId;
    }
}
