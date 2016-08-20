package com.entity.base;

import com.entity.Task;

/**
 * AbstractTaskItem entity provides the base persistence definition of the
 * TaskItem entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTaskItem implements java.io.Serializable {

	// Fields

	private Integer taskItemId;
	private Task task;
	private String taskDetail;

	// Constructors

	/** default constructor */
	public AbstractTaskItem() {
	}

	/** minimal constructor */
	public AbstractTaskItem(Task task) {
		this.task = task;
	}

	/** full constructor */
	public AbstractTaskItem(Task task, String taskDetail) {
		this.task = task;
		this.taskDetail = taskDetail;
	}

	// Property accessors

	public Integer getTaskItemId() {
		return this.taskItemId;
	}

	public void setTaskItemId(Integer taskItemId) {
		this.taskItemId = taskItemId;
	}

	public Task getTask() {
		return this.task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public String getTaskDetail() {
		return this.taskDetail;
	}

	public void setTaskDetail(String taskDetail) {
		this.taskDetail = taskDetail;
	}

}