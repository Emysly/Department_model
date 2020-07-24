package com.emysilva.model.student;

import com.emysilva.model.student.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student;

    @BeforeEach
    void setUp() {
        student = new Student("Chukwuebuka", "Emmanuel", "Student", "Electrical and Electronics Engineering", 27, 500, new String[]{"EEE521", "EEE502", "EEE504", "EEC344", "EEE570"});
    }

    @Test
    void getFirstname() {
        assertNotNull(student.getFirstname(), "getFirstname should not be empty");
    }

    @Test
    void getLastname() {
        assertNotNull(student.getLastname(), "getLastname should not be empty");
    }

    @Test
    void getRole() {
        assertNotNull(student.getRole(), "getRole should not be empty");
    }

    @Test
    void getDepartment() {
        assertNotNull(student.getDepartment(), "getDepartment should not be empty");
    }

    @Test
    void getAge() {
        assertNotNull(student.getAge(), "getAge should not be empty");
    }

    @Test
    void getLevel() {
        assertNotNull(student.getLevel(), "getLevel should not be empty");
    }

    @Test
    void getCourses() {
        assertArrayEquals(student.getCourses(), student.getCourses(), "getCourses should match");
    }

    @Test
    void canTakeCourse() {
        assertTrue(student.canTakeCourse(), "canTakeCourse should be true");
    }
}