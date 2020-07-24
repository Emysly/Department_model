package com.emysilva.model.course;

import java.util.Date;

public class CourseModel {
    private String name;
    private int level;
    private String department;
    private String teacher;
    private Date scheduledTime;

    public CourseModel(String name, int level, String department, String teacher, Date scheduledTime) {
        this.name = name;
        this.level = level;
        this.department = department;
        this.teacher = teacher;
        this.scheduledTime = scheduledTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public Date getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(Date scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    @Override
    public String toString() {
        return "CourseModel{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", department='" + department + '\'' +
                ", teacher='" + teacher + '\'' +
                ", scheduledTime=" + scheduledTime +
                '}';
    }
}
