package com.emysilva.model.teacher;

import com.emysilva.model.principal.PrincipalTeacherNonAcedmicStaffModel;

import java.util.Arrays;

public class Teacher extends PrincipalTeacherNonAcedmicStaffModel {
    private String[] departments;
    private String[] courses;

    public Teacher(String firstname, String lastname, String role, String[] departments, String[] courses) {
        super(firstname, lastname, role);
        this.departments = departments;
        this.courses = courses;
    }

    public String[] getDepartments() {
        return departments;
    }

    public void setDepartments(String[] departments) {
        this.departments = departments;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public boolean canTeachACourse() {
        return true;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "departments=" + Arrays.toString(departments) +
                ", courses=" + Arrays.toString(courses) +
                '}';
    }
}
