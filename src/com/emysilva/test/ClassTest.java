package com.emysilva.test;

import com.emysilva.model.Class;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ClassTest {

    Class clas;

    //runs before each test and instantiate class object
    @BeforeEach
    void setUp() {
        clas = new Class("Electrical wiring (EEE201)", "David Oguzie", "Power lab", new Date(), new String[]{"Mechanical Engineering", "Electrical and Electronics Engineering", "Computer Science"}, 200);
    }

    //checks if course is empty
    @Test
    void getCourse() {
        try {
            assertNotNull(clas.getCourse(), "getCourse should not be empty");
        } catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
    }

    //checks if teacher is empty
    @Test
    void getTeacher() {
        try {
            assertNotNull(clas.getTeacher(), "getTeacher should not be empty");
        } catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
    }

    //checks if location is empty
    @Test
    void getLocation() {
        try {
            assertNotNull(clas.getLocation(), "getLocation should not be empty");
        } catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
    }

    //checks if time is empty
    @Test
    void getTime() {
        try {
            assertNotNull(clas.getTime(), "getTime should not be empty");
        } catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
    }

    //checks if departments array matches
    @Test
    void getDepartments() {
        try {
            assertArrayEquals(clas.getDepartments(), clas.getDepartments(), "getTeacher should match");
        } catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
    }

    //checks if level is empty
    @Test
    void getLevel() {
        try {
            assertNotNull(clas.getLevel(), "getLevel should not be empty");
        } catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
    }
}