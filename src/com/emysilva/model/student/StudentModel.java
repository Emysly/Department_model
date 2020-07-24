package com.emysilva.model.student;

import java.util.Arrays;

public class StudentModel {
    private String firstname;
    private String lastname;
    private String role;
    private String department;
    private int age;
    private int level;
    private String[] courses;

    public StudentModel(String firstname, String lastname, String role, String department, int age, int level, String[] courses) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.role = role;
        this.department = department;
        this.age = age;
        this.level = level;
        this.courses = courses;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "StudentModel{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", role='" + role + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", level=" + level +
                ", courses=" + Arrays.toString(courses) +
                '}';
    }
}
