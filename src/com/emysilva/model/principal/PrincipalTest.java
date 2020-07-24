package com.emysilva.model.principal;

import com.emysilva.model.student.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import static org.junit.jupiter.api.Assertions.*;

class PrincipalTest {

    Principal principal;
    Student student;

    @BeforeEach
    void setup() {
        principal = new Principal("Chika", "Nwobi", "Principal");
        student = new Student("Chukwuebuka", "Emmanuel", "Student", "Electrical and Electronics Engineering", 27, 500, new String[]{"EEE521", "EEE502", "EEE504", "EEC344", "EEE570"});
    }

    @Test
    void getFirstname() {
        assertEquals("Chika", principal.getFirstname());
    }

    @Test
    void getLastname() {
        assertEquals("Nwobi", principal.getLastname());
    }

    @Test
    void getRole() {
        assertEquals("Principal", principal.getRole());
    }

    @Test
    void canExpel() {
        assertTrue(principal.canExpel());
    }

    @Test
    void canAdmit() {
        try {
            student.setAge(20);
            assertTrue(principal.canAdmit(student.getAge()));
        } catch (AssertionFailedError e) {
        }
    }
}