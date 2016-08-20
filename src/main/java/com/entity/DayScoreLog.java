package com.entity;

import com.entity.base.AbstractDayScoreLog;

import java.sql.Timestamp;

/**
 * DayScoreLog entity. @author MyEclipse Persistence Tools
 */
public class DayScoreLog extends AbstractDayScoreLog implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public DayScoreLog() {
	}

	/** minimal constructor */
	public DayScoreLog(User user) {
		super(user);
	}

	/** full constructor */
	public DayScoreLog(User user, Integer totleScore, Integer addScore, Integer cutScore, Timestamp scoreLogDate) {
		super(user, totleScore, addScore, cutScore, scoreLogDate);
	}

}
