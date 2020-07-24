package com.emysilva.model.student;

public class Student extends StudentModel {

    public Student(String firstname, String lastname, String role, String department, int age, int level, String[] courses) {
        super(firstname, lastname, role, department, age, level, courses);
    }

    public boolean canTakeCourse() {
        return true;
    }
}
