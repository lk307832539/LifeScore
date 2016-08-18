package com.entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by LK on 2016/8/15.
 */
@Entity
@Table(name = "user_ext", schema = "lifescore", catalog = "")
public class UserExt {
    private int userExtId;
    private int userId;
    private String userImg;
    private String nickName;
    private String realName;
    private Date birthday;
    private String sex;
    private String wechat;
    private String qq;
    private String address;
    private String profession;
    private String intro;
    private User userByUserId;

    @Id
    @Column(name = "user_ext_id", nullable = false)
    public int getUserExtId() {
        return userExtId;
    }

    public void setUserExtId(int userExtId) {
        this.userExtId = userExtId;
    }

    @Basic
    @Column(name = "user_id", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "user_img", nullable = true, length = 255)
    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    @Basic
    @Column(name = "nick_name", nullable = true, length = 255)
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Basic
    @Column(name = "real_name", nullable = true, length = 255)
    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Basic
    @Column(name = "birthday", nullable = true)
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "sex", nullable = true, length = 255)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "wechat", nullable = true, length = 255)
    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    @Basic
    @Column(name = "qq", nullable = true, length = 255)
    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    @Basic
    @Column(name = "address", nullable = true, length = 255)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "profession", nullable = true, length = 255)
    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Basic
    @Column(name = "intro", nullable = true, length = -1)
    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserExt userExt = (UserExt) o;

        if (userExtId != userExt.userExtId) return false;
        if (userId != userExt.userId) return false;
        if (userImg != null ? !userImg.equals(userExt.userImg) : userExt.userImg != null) return false;
        if (nickName != null ? !nickName.equals(userExt.nickName) : userExt.nickName != null) return false;
        if (realName != null ? !realName.equals(userExt.realName) : userExt.realName != null) return false;
        if (birthday != null ? !birthday.equals(userExt.birthday) : userExt.birthday != null) return false;
        if (sex != null ? !sex.equals(userExt.sex) : userExt.sex != null) return false;
        if (wechat != null ? !wechat.equals(userExt.wechat) : userExt.wechat != null) return false;
        if (qq != null ? !qq.equals(userExt.qq) : userExt.qq != null) return false;
        if (address != null ? !address.equals(userExt.address) : userExt.address != null) return false;
        if (profession != null ? !profession.equals(userExt.profession) : userExt.profession != null) return false;
        if (intro != null ? !intro.equals(userExt.intro) : userExt.intro != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userExtId;
        result = 31 * result + userId;
        result = 31 * result + (userImg != null ? userImg.hashCode() : 0);
        result = 31 * result + (nickName != null ? nickName.hashCode() : 0);
        result = 31 * result + (realName != null ? realName.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (wechat != null ? wechat.hashCode() : 0);
        result = 31 * result + (qq != null ? qq.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (profession != null ? profession.hashCode() : 0);
        result = 31 * result + (intro != null ? intro.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false)
    public User getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(User userByUserId) {
        this.userByUserId = userByUserId;
    }
}
