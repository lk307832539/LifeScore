package com.entity;

import com.entity.base.AbstractUser;

import java.sql.Timestamp;
import java.util.Set;

/**
 * User entity. @author MyEclipse Persistence Tools
 */
public class User extends AbstractUser implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public User() {
	}

	/** full constructor */
	public User(String userName, String nikeName, String email, String password, Timestamp registerTime,
			String registerIp, Timestamp lastLoginTime, String lastLoginIp, String loginCount, String validateCode,
			Short regiestType, Integer score, Set productTypes, Set taskTypes, Set dayScoreLogs, Set tasks,
			Set exchangeItems, Set productTypes_1, Set tasks_1, Set exchangeItems_1, Set userExts, Set dayScoreLogs_1,
			Set taskTypes_1, Set products, Set userExts_1, Set products_1) {
		super(userName, nikeName, email, password, registerTime, registerIp, lastLoginTime, lastLoginIp, loginCount,
				validateCode, regiestType, score, productTypes, taskTypes, dayScoreLogs, tasks, exchangeItems,
				productTypes_1, tasks_1, exchangeItems_1, userExts, dayScoreLogs_1, taskTypes_1, products, userExts_1,
				products_1);
	}

}
