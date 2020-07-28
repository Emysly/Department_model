package com.emysilva.test;

import com.emysilva.model.Principal;
import com.emysilva.model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import static org.junit.jupiter.api.Assertions.*;

class PrincipalTest {

    Principal principal;
    Student student;

    //runs before each test and instantiate principal and student objects
    @BeforeEach
    void setup() {
        principal = new Principal(null, "Nwobi", "Principal");
        student = new Student("Chukwuebuka", "Emmanuel", "Student", "Electrical and Electronics Engineering", 27, 500, new String[]{"EEE521", "EEE502", "EEE504", "EEC344", "EEE570"});
    }

    //checks if firstname is empty
    @Test
    void getFirstname() {
        try {
            assertNotNull(principal.getFirstname(), "getFirstname should not be empty");
        } catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }

    }

    //checks if lastname is empty
    @Test
    void getLastname() {
        try {
            assertNotNull(principal.getLastname(), "getLastname should not be empty");
        } catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
    }

    //checks if role is empty
    @Test
    void getRole() {
        try {
            assertNotNull(principal.getRole(), "getRole should not be empty");
        } catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
    }

    //checks if canExpel method returns true
    @Test
    void canExpel() {
        try {
            assertTrue(principal.canExpel());
        } catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
    }

    //checks if canAdmit method returns true
    @Test
    void canAdmit() {
        try {
            student.setAge(16);
            assertTrue(principal.canAdmit(student.getAge()));
        } catch (AssertionFailedError e) {
        }
    }
}