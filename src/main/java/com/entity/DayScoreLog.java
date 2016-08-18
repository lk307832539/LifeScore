package com.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by LK on 2016/8/15.
 */
@Entity
@Table(name = "day_score_log", schema = "lifescore", catalog = "")
public class DayScoreLog {
    private int scoreLogId;
    private int userId;
    private Integer totleScore;
    private Integer addScore;
    private Integer cutScore;
    private Timestamp scoreLogDate;
    private User userByUserId;

    @Id
    @Column(name = "score_log_id", nullable = false)
    public int getScoreLogId() {
        return scoreLogId;
    }

    public void setScoreLogId(int scoreLogId) {
        this.scoreLogId = scoreLogId;
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
    @Column(name = "totle_score", nullable = true)
    public Integer getTotleScore() {
        return totleScore;
    }

    public void setTotleScore(Integer totleScore) {
        this.totleScore = totleScore;
    }

    @Basic
    @Column(name = "add_score", nullable = true)
    public Integer getAddScore() {
        return addScore;
    }

    public void setAddScore(Integer addScore) {
        this.addScore = addScore;
    }

    @Basic
    @Column(name = "cut_score", nullable = true)
    public Integer getCutScore() {
        return cutScore;
    }

    public void setCutScore(Integer cutScore) {
        this.cutScore = cutScore;
    }

    @Basic
    @Column(name = "score_log_date", nullable = true)
    public Timestamp getScoreLogDate() {
        return scoreLogDate;
    }

    public void setScoreLogDate(Timestamp scoreLogDate) {
        this.scoreLogDate = scoreLogDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DayScoreLog that = (DayScoreLog) o;

        if (scoreLogId != that.scoreLogId) return false;
        if (userId != that.userId) return false;
        if (totleScore != null ? !totleScore.equals(that.totleScore) : that.totleScore != null) return false;
        if (addScore != null ? !addScore.equals(that.addScore) : that.addScore != null) return false;
        if (cutScore != null ? !cutScore.equals(that.cutScore) : that.cutScore != null) return false;
        if (scoreLogDate != null ? !scoreLogDate.equals(that.scoreLogDate) : that.scoreLogDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = scoreLogId;
        result = 31 * result + userId;
        result = 31 * result + (totleScore != null ? totleScore.hashCode() : 0);
        result = 31 * result + (addScore != null ? addScore.hashCode() : 0);
        result = 31 * result + (cutScore != null ? cutScore.hashCode() : 0);
        result = 31 * result + (scoreLogDate != null ? scoreLogDate.hashCode() : 0);
        return result;
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
