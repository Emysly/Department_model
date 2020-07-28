package com.emysilva.model;

import com.emysilva.util.StudentUtil;

public class Student extends StudentUtil {

    public Student(String firstname, String lastname, String role, String department, int age, int level, String[] courses) {
        super(firstname, lastname, role, department, age, level, courses);
    }

    public boolean canTakeCourse() {
        return true;
    }
}
