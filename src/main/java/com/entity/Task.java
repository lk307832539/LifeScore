package com.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by LK on 2016/8/15.
 */
@Entity
public class Task {
    private int taskId;
    private int taskUserId;
    private int taskTypeId;
    private Timestamp taskCreateTime;
    private Timestamp taskStartTime;
    private Timestamp taskEndTime;
    private Timestamp taskFinishTime;
    private String taskTitle;
    private Byte taskStatus;
    private String taskDescription;
    private Byte taskPriority;
    private Byte taskIsRepeat;
    private Integer taskRepeatDate;
    private User userByTaskUserId;
    private TaskType taskTypeByTaskTypeId;
    private Collection<TaskItem> taskItemsByTaskId;

    @Id
    @Column(name = "task_id", nullable = false)
    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    @Basic
    @Column(name = "task_user_id", nullable = false)
    public int getTaskUserId() {
        return taskUserId;
    }

    public void setTaskUserId(int taskUserId) {
        this.taskUserId = taskUserId;
    }

    @Basic
    @Column(name = "task_type_id", nullable = false)
    public int getTaskTypeId() {
        return taskTypeId;
    }

    public void setTaskTypeId(int taskTypeId) {
        this.taskTypeId = taskTypeId;
    }

    @Basic
    @Column(name = "task_create_time", nullable = true)
    public Timestamp getTaskCreateTime() {
        return taskCreateTime;
    }

    public void setTaskCreateTime(Timestamp taskCreateTime) {
        this.taskCreateTime = taskCreateTime;
    }

    @Basic
    @Column(name = "task_start_time", nullable = true)
    public Timestamp getTaskStartTime() {
        return taskStartTime;
    }

    public void setTaskStartTime(Timestamp taskStartTime) {
        this.taskStartTime = taskStartTime;
    }

    @Basic
    @Column(name = "task_end_time", nullable = true)
    public Timestamp getTaskEndTime() {
        return taskEndTime;
    }

    public void setTaskEndTime(Timestamp taskEndTime) {
        this.taskEndTime = taskEndTime;
    }

    @Basic
    @Column(name = "task_finish_time", nullable = true)
    public Timestamp getTaskFinishTime() {
        return taskFinishTime;
    }

    public void setTaskFinishTime(Timestamp taskFinishTime) {
        this.taskFinishTime = taskFinishTime;
    }

    @Basic
    @Column(name = "task_title", nullable = true, length = 255)
    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    @Basic
    @Column(name = "task_status", nullable = true)
    public Byte getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Byte taskStatus) {
        this.taskStatus = taskStatus;
    }

    @Basic
    @Column(name = "task_description", nullable = true, length = -1)
    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    @Basic
    @Column(name = "task_priority", nullable = true)
    public Byte getTaskPriority() {
        return taskPriority;
    }

    public void setTaskPriority(Byte taskPriority) {
        this.taskPriority = taskPriority;
    }

    @Basic
    @Column(name = "task_is_repeat", nullable = true)
    public Byte getTaskIsRepeat() {
        return taskIsRepeat;
    }

    public void setTaskIsRepeat(Byte taskIsRepeat) {
        this.taskIsRepeat = taskIsRepeat;
    }

    @Basic
    @Column(name = "task_repeat_date", nullable = true)
    public Integer getTaskRepeatDate() {
        return taskRepeatDate;
    }

    public void setTaskRepeatDate(Integer taskRepeatDate) {
        this.taskRepeatDate = taskRepeatDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task task = (Task) o;

        if (taskId != task.taskId) return false;
        if (taskUserId != task.taskUserId) return false;
        if (taskTypeId != task.taskTypeId) return false;
        if (taskCreateTime != null ? !taskCreateTime.equals(task.taskCreateTime) : task.taskCreateTime != null)
            return false;
        if (taskStartTime != null ? !taskStartTime.equals(task.taskStartTime) : task.taskStartTime != null)
            return false;
        if (taskEndTime != null ? !taskEndTime.equals(task.taskEndTime) : task.taskEndTime != null) return false;
        if (taskFinishTime != null ? !taskFinishTime.equals(task.taskFinishTime) : task.taskFinishTime != null)
            return false;
        if (taskTitle != null ? !taskTitle.equals(task.taskTitle) : task.taskTitle != null) return false;
        if (taskStatus != null ? !taskStatus.equals(task.taskStatus) : task.taskStatus != null) return false;
        if (taskDescription != null ? !taskDescription.equals(task.taskDescription) : task.taskDescription != null)
            return false;
        if (taskPriority != null ? !taskPriority.equals(task.taskPriority) : task.taskPriority != null) return false;
        if (taskIsRepeat != null ? !taskIsRepeat.equals(task.taskIsRepeat) : task.taskIsRepeat != null) return false;
        if (taskRepeatDate != null ? !taskRepeatDate.equals(task.taskRepeatDate) : task.taskRepeatDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = taskId;
        result = 31 * result + taskUserId;
        result = 31 * result + taskTypeId;
        result = 31 * result + (taskCreateTime != null ? taskCreateTime.hashCode() : 0);
        result = 31 * result + (taskStartTime != null ? taskStartTime.hashCode() : 0);
        result = 31 * result + (taskEndTime != null ? taskEndTime.hashCode() : 0);
        result = 31 * result + (taskFinishTime != null ? taskFinishTime.hashCode() : 0);
        result = 31 * result + (taskTitle != null ? taskTitle.hashCode() : 0);
        result = 31 * result + (taskStatus != null ? taskStatus.hashCode() : 0);
        result = 31 * result + (taskDescription != null ? taskDescription.hashCode() : 0);
        result = 31 * result + (taskPriority != null ? taskPriority.hashCode() : 0);
        result = 31 * result + (taskIsRepeat != null ? taskIsRepeat.hashCode() : 0);
        result = 31 * result + (taskRepeatDate != null ? taskRepeatDate.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "task_user_id", referencedColumnName = "user_id", nullable = false)
    public User getUserByTaskUserId() {
        return userByTaskUserId;
    }

    public void setUserByTaskUserId(User userByTaskUserId) {
        this.userByTaskUserId = userByTaskUserId;
    }

    @ManyToOne
    @JoinColumn(name = "task_type_id", referencedColumnName = "task_type_id", nullable = false)
    public TaskType getTaskTypeByTaskTypeId() {
        return taskTypeByTaskTypeId;
    }

    public void setTaskTypeByTaskTypeId(TaskType taskTypeByTaskTypeId) {
        this.taskTypeByTaskTypeId = taskTypeByTaskTypeId;
    }

    @OneToMany(mappedBy = "taskByTaskId")
    public Collection<TaskItem> getTaskItemsByTaskId() {
        return taskItemsByTaskId;
    }

    public void setTaskItemsByTaskId(Collection<TaskItem> taskItemsByTaskId) {
        this.taskItemsByTaskId = taskItemsByTaskId;
    }
}
