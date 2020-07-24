package com.emysilva.model.course;

import com.emysilva.model.course.Course;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    Course course;

    @BeforeEach
    void setUp() {
        course = new Course("Electrical Installation (EEE521)", 500,"Electrical and Electronics Engineering", "David Oguzie", new Date());
    }

    @Test
    void getName() {
        assertNotNull(course.getName(), "getName should not be empty");
    }

    @Test
    void getLevel() {
        assertNotNull(course.getLevel(), "getLevel should not be empty");
    }

    @Test
    void getDepartment() {
        assertNotNull(course.getDepartment(), "getDepartment should not be empty");
    }

    @Test
    void getTeacher() {
        assertNotNull(course.getTeacher(), "getTeacher should not be empty");
    }

    @Test
    void getScheduledTime() {
        assertNotNull(course.getScheduledTime(), "getScheduledTime should not be empty");
    }
}