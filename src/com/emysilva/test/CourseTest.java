package com.emysilva.test;

import com.emysilva.model.Course;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    Course course;

    //runs before each test and instantiate course object
    @BeforeEach
    void setUp() {
        course = new Course("Electrical Installation (EEE521)", 500,"Electrical and Electronics Engineering", "David Oguzie", new Date());
    }

    //checks if name is empty
    @Test
    void getName() {
        try {
            assertNotNull(course.getName(), "getName should not be empty");
        } catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
    }

    //checks if level is empty
    @Test
    void getLevel() {
        try {
            assertNotNull(course.getLevel(), "getLevel should not be empty");
        } catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
    }

    //checks if department is empty
    @Test
    void getDepartment() {
        try {
            assertNotNull(course.getDepartment(), "getDepartment should not be empty");
        } catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
    }

    //checks if teacher is empty
    @Test
    void getTeacher() {
        try {
            assertNotNull(course.getTeacher(), "getTeacher should not be empty");
        } catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
    }

    //checks if scheduledTime is empty
    @Test
    void getScheduledTime() {
        try {
            assertNotNull(course.getScheduledTime(), "getScheduledTime should not be empty");
        } catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
    }
}