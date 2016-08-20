package com.entity;

import com.entity.base.AbstractTaskType;

import java.util.Set;

/**
 * TaskType entity. @author MyEclipse Persistence Tools
 */
public class TaskType extends AbstractTaskType implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TaskType() {
	}

	/** minimal constructor */
	public TaskType(User user) {
		super(user);
	}

	/** full constructor */
	public TaskType(User user, String taskTypeName, Integer taskTypeScore, Short taskTypePriority,
			Short taskTypeIsEnabled, String taskTypeImg, Set tasks, Set tasks_1) {
		super(user, taskTypeName, taskTypeScore, taskTypePriority, taskTypeIsEnabled, taskTypeImg, tasks, tasks_1);
	}

}
