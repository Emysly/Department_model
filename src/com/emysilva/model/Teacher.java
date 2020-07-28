package com.emysilva.model;

import com.emysilva.util.PrincipalTeacherNonAcedmicStaffUtil;

import java.util.Arrays;

public class Teacher extends PrincipalTeacherNonAcedmicStaffUtil {
    private String[] departments;
    private String[] courses;

    //teacher constructor
    public Teacher(String firstname, String lastname, String role, String[] departments, String[] courses) {
        super(firstname, lastname, role);
        this.departments = departments;
        this.courses = courses;
    }

    //departments getter
    public String[] getDepartments() {
        return departments;
    }

    //departments setter
    public void setDepartments(String[] departments) {
        this.departments = departments;
    }

    //courses getter
    public String[] getCourses() {
        return courses;
    }

    //courses setter
    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    //canTeachACourse method
    public boolean canTeachACourse() {
        return true;
    }

    //concat all attributes to string
    @Override
    public String toString() {
        return "Teacher{" +
                "departments=" + Arrays.toString(departments) +
                ", courses=" + Arrays.toString(courses) +
                '}';
    }
}
