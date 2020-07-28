package com.emysilva.util;

import java.util.Arrays;
import java.util.Date;

public class ClassUtil {
    private String course;
    private String teacher;
    private String location;
    private Date time;
    private String[] departments;
    private int level;

    public ClassUtil(String course, String teacher, String location, Date time, String[] departments, int level) {
        this.course = course;
        this.teacher = teacher;
        this.location = location;
        this.time = time;
        this.departments = departments;
        this.level = level;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String[] getDepartments() {
        return departments;
    }

    public void setDepartments(String[] departments) {
        this.departments = departments;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "ClassModel{" +
                "course='" + course + '\'' +
                ", teacher='" + teacher + '\'' +
                ", location='" + location + '\'' +
                ", time=" + time +
                ", departments=" + Arrays.toString(departments) +
                ", level='" + level + '\'' +
                '}';
    }
}
