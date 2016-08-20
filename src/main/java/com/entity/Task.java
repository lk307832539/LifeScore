package com.entity;

import com.entity.base.AbstractTask;

import java.sql.Timestamp;
import java.util.Set;

/**
 * Task entity. @author MyEclipse Persistence Tools
 */
public class Task extends AbstractTask implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Task() {
	}

	/** minimal constructor */
	public Task(TaskType taskType, User user) {
		super(taskType, user);
	}

	/** full constructor */
	public Task(TaskType taskType, User user, Timestamp taskCreateTime, Timestamp taskStartTime, Timestamp taskEndTime,
			Timestamp taskFinishTime, String taskTitle, Short taskStatus, String taskDescription, Short taskPriority,
			Short taskIsRepeat, Integer taskRepeatDate, Set taskItems, Set taskItems_1) {
		super(taskType, user, taskCreateTime, taskStartTime, taskEndTime, taskFinishTime, taskTitle, taskStatus,
				taskDescription, taskPriority, taskIsRepeat, taskRepeatDate, taskItems, taskItems_1);
	}

}
