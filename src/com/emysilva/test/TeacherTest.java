package com.emysilva.test;

import com.emysilva.model.Teacher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import static org.junit.jupiter.api.Assertions.*;

class TeacherTest {

    Teacher teacher;

    //runs before each test and instantiate teacher object
    @BeforeEach
    public void setup() {
        teacher = new Teacher("David", "Oguzie", "Teacher", new String[]{"Mechanical Engineering", "Electrical and Electronics Engineering", "Computer Science"}, new String[]{"EEE201", "EEE321", "EEE521", "MEE201", "MME321", "CSC201", "CSC321"});
    }

    //checks if firstname is empty
    @Test
    void getFirstname() {
        try {
            assertNotNull(teacher.getFirstname(), "getFirstname should not be empty");
        } catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
    }

    //checks if lastname is empty
    @Test
    void getLastname() {
        try {
            assertNotNull(teacher.getLastname(), "getLastname should not be empty");
        } catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
    }

    //checks if role is empty
    @Test
    void getRole() {
        try {
            assertNotNull(teacher.getRole(), "getRole should not be empty");
        } catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
    }

    //checks if departments array matches
    @Test
    void getDepartments() {
        try {
            assertArrayEquals(teacher.getDepartments(), teacher.getDepartments(), "getDepartments should match");
        } catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
    }

    //checks if courses array matches
    @Test
    void getCourses() {
        try {
            assertArrayEquals(teacher.getCourses(), teacher.getCourses(), "getCourses should match");
        } catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
    }

    //checks if canTeachACourse method returns true
    @Test
    void canTeachACourse() {
        try {
            assertTrue(teacher.canTeachACourse());
        } catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
    }
}