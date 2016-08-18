package com.entity;

import javax.persistence.*;

/**
 * Created by LK on 2016/8/15.
 */
@Entity
@Table(name = "task_item", schema = "lifescore", catalog = "")
public class TaskItem {
    private int taskItemId;
    private int taskId;
    private String taskDetail;
    private Task taskByTaskId;

    @Id
    @Column(name = "task_item_id", nullable = false)
    public int getTaskItemId() {
        return taskItemId;
    }

    public void setTaskItemId(int taskItemId) {
        this.taskItemId = taskItemId;
    }

    @Basic
    @Column(name = "task_id", nullable = false)
    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    @Basic
    @Column(name = "task_detail", nullable = true, length = 255)
    public String getTaskDetail() {
        return taskDetail;
    }

    public void setTaskDetail(String taskDetail) {
        this.taskDetail = taskDetail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaskItem taskItem = (TaskItem) o;

        if (taskItemId != taskItem.taskItemId) return false;
        if (taskId != taskItem.taskId) return false;
        if (taskDetail != null ? !taskDetail.equals(taskItem.taskDetail) : taskItem.taskDetail != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = taskItemId;
        result = 31 * result + taskId;
        result = 31 * result + (taskDetail != null ? taskDetail.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "task_id", referencedColumnName = "task_id", nullable = false)
    public Task getTaskByTaskId() {
        return taskByTaskId;
    }

    public void setTaskByTaskId(Task taskByTaskId) {
        this.taskByTaskId = taskByTaskId;
    }
}
