package com.zhj.examsystem.entity;

import java.util.Date;

/**
 * 考试
 */
public class Exam {
    private long id;
    private String title;
    private String subTitle;
    private int type;
    private Date startTime;
    private Date finishTime;
    private int totalScore;
    private int passScore;
    private int createdBy;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public int getPassScore() {
        return passScore;
    }

    public void setPassScore(int passScore) {
        this.passScore = passScore;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", subTitel='" + subTitle + '\'' +
                ", type=" + type +
                ", startTime=" + startTime +
                ", finishTime=" + finishTime +
                ", totalScore=" + totalScore +
                ", passScore=" + passScore +
                ", createdBy=" + createdBy +
                '}';
    }
}
