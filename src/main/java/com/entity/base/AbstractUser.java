package com.entity.base;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import javax.persistence.Column;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractUser entity provides the base persistence definition of the User
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUser implements java.io.Serializable {

	// Fields

	private Integer userId;
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
	private Short regiestType;
	private Integer score;
	private Set productTypes = new HashSet(0);
	private Set taskTypes = new HashSet(0);
	private Set dayScoreLogs = new HashSet(0);
	private Set tasks = new HashSet(0);
	private Set exchangeItems = new HashSet(0);
	private Set productTypes_1 = new HashSet(0);
	private Set tasks_1 = new HashSet(0);
	private Set exchangeItems_1 = new HashSet(0);
	private Set userExts = new HashSet(0);
	private Set dayScoreLogs_1 = new HashSet(0);
	private Set taskTypes_1 = new HashSet(0);
	private Set products = new HashSet(0);
	private Set userExts_1 = new HashSet(0);
	private Set products_1 = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractUser() {
	}

	/** full constructor */
	public AbstractUser(String userName, String nikeName, String email, String password, Timestamp registerTime,
			String registerIp, Timestamp lastLoginTime, String lastLoginIp, String loginCount, String validateCode,
			Short regiestType, Integer score, Set productTypes, Set taskTypes, Set dayScoreLogs, Set tasks,
			Set exchangeItems, Set productTypes_1, Set tasks_1, Set exchangeItems_1, Set userExts, Set dayScoreLogs_1,
			Set taskTypes_1, Set products, Set userExts_1, Set products_1) {
		this.userName = userName;
		this.nikeName = nikeName;
		this.email = email;
		this.password = password;
		this.registerTime = registerTime;
		this.registerIp = registerIp;
		this.lastLoginTime = lastLoginTime;
		this.lastLoginIp = lastLoginIp;
		this.loginCount = loginCount;
		this.validateCode = validateCode;
		this.regiestType = regiestType;
		this.score = score;
		this.productTypes = productTypes;
		this.taskTypes = taskTypes;
		this.dayScoreLogs = dayScoreLogs;
		this.tasks = tasks;
		this.exchangeItems = exchangeItems;
		this.productTypes_1 = productTypes_1;
		this.tasks_1 = tasks_1;
		this.exchangeItems_1 = exchangeItems_1;
		this.userExts = userExts;
		this.dayScoreLogs_1 = dayScoreLogs_1;
		this.taskTypes_1 = taskTypes_1;
		this.products = products;
		this.userExts_1 = userExts_1;
		this.products_1 = products_1;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getNikeName() {
		return this.nikeName;
	}

	public void setNikeName(String nikeName) {
		this.nikeName = nikeName;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Timestamp getRegisterTime() {
		return this.registerTime;
	}

	public void setRegisterTime(Timestamp registerTime) {
		this.registerTime = registerTime;
	}

	public String getRegisterIp() {
		return this.registerIp;
	}

	public void setRegisterIp(String registerIp) {
		this.registerIp = registerIp;
	}

	public Timestamp getLastLoginTime() {
		return this.lastLoginTime;
	}

	public void setLastLoginTime(Timestamp lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public String getLastLoginIp() {
		return this.lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	public String getLoginCount() {
		return this.loginCount;
	}

	public void setLoginCount(String loginCount) {
		this.loginCount = loginCount;
	}

	public String getValidateCode() {
		return this.validateCode;
	}

	public void setValidateCode(String validateCode) {
		this.validateCode = validateCode;
	}

	public Short getRegiestType() {
		return this.regiestType;
	}

	public void setRegiestType(Short regiestType) {
		this.regiestType = regiestType;
	}

	public Integer getScore() {
		return this.score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Set getProductTypes() {
		return this.productTypes;
	}

	public void setProductTypes(Set productTypes) {
		this.productTypes = productTypes;
	}

	public Set getTaskTypes() {
		return this.taskTypes;
	}

	public void setTaskTypes(Set taskTypes) {
		this.taskTypes = taskTypes;
	}

	public Set getDayScoreLogs() {
		return this.dayScoreLogs;
	}

	public void setDayScoreLogs(Set dayScoreLogs) {
		this.dayScoreLogs = dayScoreLogs;
	}

	public Set getTasks() {
		return this.tasks;
	}

	public void setTasks(Set tasks) {
		this.tasks = tasks;
	}

	public Set getExchangeItems() {
		return this.exchangeItems;
	}

	public void setExchangeItems(Set exchangeItems) {
		this.exchangeItems = exchangeItems;
	}

	public Set getProductTypes_1() {
		return this.productTypes_1;
	}

	public void setProductTypes_1(Set productTypes_1) {
		this.productTypes_1 = productTypes_1;
	}

	public Set getTasks_1() {
		return this.tasks_1;
	}

	public void setTasks_1(Set tasks_1) {
		this.tasks_1 = tasks_1;
	}

	public Set getExchangeItems_1() {
		return this.exchangeItems_1;
	}

	public void setExchangeItems_1(Set exchangeItems_1) {
		this.exchangeItems_1 = exchangeItems_1;
	}

	public Set getUserExts() {
		return this.userExts;
	}

	public void setUserExts(Set userExts) {
		this.userExts = userExts;
	}

	public Set getDayScoreLogs_1() {
		return this.dayScoreLogs_1;
	}

	public void setDayScoreLogs_1(Set dayScoreLogs_1) {
		this.dayScoreLogs_1 = dayScoreLogs_1;
	}

	public Set getTaskTypes_1() {
		return this.taskTypes_1;
	}

	public void setTaskTypes_1(Set taskTypes_1) {
		this.taskTypes_1 = taskTypes_1;
	}

	public Set getProducts() {
		return this.products;
	}

	public void setProducts(Set products) {
		this.products = products;
	}

	public Set getUserExts_1() {
		return this.userExts_1;
	}

	public void setUserExts_1(Set userExts_1) {
		this.userExts_1 = userExts_1;
	}

	public Set getProducts_1() {
		return this.products_1;
	}

	public void setProducts_1(Set products_1) {
		this.products_1 = products_1;
	}

}