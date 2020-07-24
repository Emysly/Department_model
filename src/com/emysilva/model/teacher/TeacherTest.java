package com.emysilva.model.teacher;

import com.emysilva.model.teacher.Teacher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeacherTest {

    Teacher teacher;

    @BeforeEach
    public void setup() {
        teacher = new Teacher("David", "Oguzie", "Teacher", new String[]{"Mechanical Engineering", "Electrical and Electronics Engineering", "Computer Science"}, new String[]{"EEE201", "EEE321", "EEE521", "MEE201", "MME321", "CSC201", "CSC321"});
    }

    @Test
    void getFirstname() {
        assertNotNull(teacher.getFirstname(), "getFirstname should not be empty");
    }

    @Test
    void getLastname() {
        assertNotNull(teacher.getLastname(), "getLastname should not be empty");
    }

    @Test
    void getRole() {
        assertNotNull(teacher.getRole(), "getRole should not be empty");
    }

    @Test
    void getDepartments() {
        assertArrayEquals(teacher.getDepartments(), teacher.getDepartments(), "getDepartments should match");
    }

    @Test
    void getCourses() {
        assertArrayEquals(teacher.getCourses(), teacher.getCourses(), "getCourses should match");
    }

    @Test
    void canTeachACourse() {
        assertTrue(teacher.canTeachACourse());
    }
}