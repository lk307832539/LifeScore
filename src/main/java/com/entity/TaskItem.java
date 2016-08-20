package com.entity;

import com.entity.base.AbstractTaskItem;

/**
 * TaskItem entity. @author MyEclipse Persistence Tools
 */
public class TaskItem extends AbstractTaskItem implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TaskItem() {
	}

	/** minimal constructor */
	public TaskItem(Task task) {
		super(task);
	}

	/** full constructor */
	public TaskItem(Task task, String taskDetail) {
		super(task, taskDetail);
	}

}
