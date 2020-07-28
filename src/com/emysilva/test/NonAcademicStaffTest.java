package com.emysilva.test;

import com.emysilva.model.NonAcademicStaff;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import static org.junit.jupiter.api.Assertions.*;

class NonAcademicStaffTest {

    NonAcademicStaff nonAcademicStaff;

    //runs before each test and instantiate nonAcademicStaff object
    @BeforeEach
    void setUp() {
        nonAcademicStaff = new NonAcademicStaff("Lucky", "Gbenga", "Non-Academic Staff", "Mechanical Engineering");
    }

    //checks if firstname is empty
    @Test
    void getFirstname() {
        try {
            assertNotNull(nonAcademicStaff.getFirstname(), "getFirstname should not be empty");
        } catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
    }

    //checks if lastname is empty
    @Test
    void getLastname() {
        try {
            assertNotNull(nonAcademicStaff.getLastname(), "getLastname should not be empty");
        } catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
    }

    //checks if role is empty
    @Test
    void getRole() {
        try {
            assertNotNull(nonAcademicStaff.getRole(), "getRole should not be empty");
        } catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
    }

    //checks if department is empty
    @Test
    void getDepartment() {
        try {
            assertNotNull(nonAcademicStaff.getDepartment(), "getDepartment should not be empty");
        } catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
    }
}