package com.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by LK on 2016/8/15.
 */
@Entity
@Table(name = "task_type", schema = "lifescore", catalog = "")
public class TaskType {
    private int taskTypeId;
    private int userId;
    private String taskTypeName;
    private Integer taskTypeScore;
    private Byte taskTypePriority;
    private Byte taskTypeIsEnabled;
    private String taskTypeImg;
    private Collection<Task> tasksByTaskTypeId;
    private User userByUserId;

    @Id
    @Column(name = "task_type_id", nullable = false)
    public int getTaskTypeId() {
        return taskTypeId;
    }

    public void setTaskTypeId(int taskTypeId) {
        this.taskTypeId = taskTypeId;
    }

    @Basic
    @Column(name = "user_id", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "task_type_name", nullable = true, length = 255)
    public String getTaskTypeName() {
        return taskTypeName;
    }

    public void setTaskTypeName(String taskTypeName) {
        this.taskTypeName = taskTypeName;
    }

    @Basic
    @Column(name = "task_type_score", nullable = true)
    public Integer getTaskTypeScore() {
        return taskTypeScore;
    }

    public void setTaskTypeScore(Integer taskTypeScore) {
        this.taskTypeScore = taskTypeScore;
    }

    @Basic
    @Column(name = "task_type_priority", nullable = true)
    public Byte getTaskTypePriority() {
        return taskTypePriority;
    }

    public void setTaskTypePriority(Byte taskTypePriority) {
        this.taskTypePriority = taskTypePriority;
    }

    @Basic
    @Column(name = "task_type_is_enabled", nullable = true)
    public Byte getTaskTypeIsEnabled() {
        return taskTypeIsEnabled;
    }

    public void setTaskTypeIsEnabled(Byte taskTypeIsEnabled) {
        this.taskTypeIsEnabled = taskTypeIsEnabled;
    }

    @Basic
    @Column(name = "task_type_img", nullable = true, length = 255)
    public String getTaskTypeImg() {
        return taskTypeImg;
    }

    public void setTaskTypeImg(String taskTypeImg) {
        this.taskTypeImg = taskTypeImg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaskType taskType = (TaskType) o;

        if (taskTypeId != taskType.taskTypeId) return false;
        if (userId != taskType.userId) return false;
        if (taskTypeName != null ? !taskTypeName.equals(taskType.taskTypeName) : taskType.taskTypeName != null)
            return false;
        if (taskTypeScore != null ? !taskTypeScore.equals(taskType.taskTypeScore) : taskType.taskTypeScore != null)
            return false;
        if (taskTypePriority != null ? !taskTypePriority.equals(taskType.taskTypePriority) : taskType.taskTypePriority != null)
            return false;
        if (taskTypeIsEnabled != null ? !taskTypeIsEnabled.equals(taskType.taskTypeIsEnabled) : taskType.taskTypeIsEnabled != null)
            return false;
        if (taskTypeImg != null ? !taskTypeImg.equals(taskType.taskTypeImg) : taskType.taskTypeImg != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = taskTypeId;
        result = 31 * result + userId;
        result = 31 * result + (taskTypeName != null ? taskTypeName.hashCode() : 0);
        result = 31 * result + (taskTypeScore != null ? taskTypeScore.hashCode() : 0);
        result = 31 * result + (taskTypePriority != null ? taskTypePriority.hashCode() : 0);
        result = 31 * result + (taskTypeIsEnabled != null ? taskTypeIsEnabled.hashCode() : 0);
        result = 31 * result + (taskTypeImg != null ? taskTypeImg.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "taskTypeByTaskTypeId")
    public Collection<Task> getTasksByTaskTypeId() {
        return tasksByTaskTypeId;
    }

    public void setTasksByTaskTypeId(Collection<Task> tasksByTaskTypeId) {
        this.tasksByTaskTypeId = tasksByTaskTypeId;
    }

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false)
    public User getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(User userByUserId) {
        this.userByUserId = userByUserId;
    }
}
