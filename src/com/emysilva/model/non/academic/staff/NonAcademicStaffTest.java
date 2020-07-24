package com.emysilva.model.non.academic.staff;

import com.emysilva.model.non.academic.staff.NonAcademicStaff;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NonAcademicStaffTest {

    NonAcademicStaff nonAcademicStaff;

    @BeforeEach
    void setUp() {
        nonAcademicStaff = new NonAcademicStaff("Lucky", "Gbenga", "Non-Academic Staff", "Mechanical Engineering");
    }

    @Test
    void getFirstname() {
        assertNotNull(nonAcademicStaff.getFirstname(), "getFirstname should not be empty");
    }

    @Test
    void getLastname() {
        assertNotNull(nonAcademicStaff.getLastname(), "getLastname should not be empty");
    }

    @Test
    void getRole() {
        assertNotNull(nonAcademicStaff.getRole(), "getRole should not be empty");
    }

    @Test
    void getDepartment() {
        assertNotNull(nonAcademicStaff.getDepartment(), "getDepartment should not be empty");
    }
}