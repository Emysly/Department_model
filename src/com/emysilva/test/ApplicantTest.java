package com.emysilva.test;

import com.emysilva.model.Applicant;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ApplicantTest {

    Applicant applicant;

    //runs before each test and instantiate applicant object
    @BeforeEach
    void setUp() {
        applicant = new Applicant("Oladapo", "Oladokun", "Student", "Mechanical Engineerig", 28, 100, new Date());
    }

    @Test
    void getFirstname() {
        assertNotNull(applicant.getFirstname(), "getFirstname should not be empty");
    }

    @Test
    void getLastname() {
        assertNotNull(applicant.getLastname(), "getLastname should not be empty");
    }

    @Test
    void getRole() {
        assertNotNull(applicant.getRole(), "getRole should not be empty");
    }

    @Test
    void getDepartment() {
        assertNotNull(applicant.getDepartment(), "getDepartment should not be empty");
    }

    @Test
    void getAge() {
        assertNotNull(applicant.getAge(), "getAge should not be empty");
    }

    @Test
    void getLevel() {
        assertNotNull(applicant.getLevel(), "getLevel should not be empty");
    }

    @Test
    void getDate() {
        assertNotNull(applicant.getDate(), "getDate should not be empty");
    }
}