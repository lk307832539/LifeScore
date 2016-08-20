package com.entity;

import com.entity.base.AbstractUserExt;

import java.util.Date;

/**
 * UserExt entity. @author MyEclipse Persistence Tools
 */
public class UserExt extends AbstractUserExt implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public UserExt() {
	}

	/** minimal constructor */
	public UserExt(User user) {
		super(user);
	}

	/** full constructor */
	public UserExt(User user, String userImg, String nickName, String realName, Date birthday, String sex,
			String wechat, String qq, String address, String profession, String intro) {
		super(user, userImg, nickName, realName, birthday, sex, wechat, qq, address, profession, intro);
	}

}
