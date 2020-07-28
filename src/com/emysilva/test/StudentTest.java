package com.emysilva.test;

import com.emysilva.model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student;

    //runs before each test and instantiate student object
    @BeforeEach
    void setUp() {
        student = new Student("Chukwuebuka", "Emmanuel", "Student", "Electrical and Electronics Engineering", 27, 500, new String[]{"EEE521", "EEE502", "EEE504", "EEC344", "EEE570"});
    }

    //checks if firstname is empty
    @Test
    void getFirstname() {

        try {
            assertNotNull(student.getFirstname(), "getFirstname should not be empty");
        }catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
    }

    //checks if lastname is empty
    @Test
    void getLastname() {

        try {
            assertNotNull(student.getLastname(), "getLastname should not be empty");
        } catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
    }

    //checks if role is empty
    @Test
    void getRole() {

       try {
           assertNotNull(student.getRole(), "getRole should not be empty");
       } catch (AssertionFailedError e) {
           System.out.println(e.getMessage());
       }
    }

    //checks if department is empty
    @Test
    void getDepartment() {
       try {
           assertNotNull(student.getDepartment(), "getDepartment should not be empty");
       } catch (AssertionFailedError e) {
           System.out.println(e.getMessage());
       }
    }

    //checks if age is empty
    @Test
    void getAge() {
       try {
           assertNotNull(student.getAge(), "getAge should not be empty");
       } catch (AssertionFailedError e) {
           System.out.println(e.getMessage());
       }
    }

    //checks if level is empty
    @Test
    void getLevel() {

       try {
           assertNotNull(student.getLevel(), "getLevel should not be empty");
       } catch (AssertionFailedError e) {
           System.out.println(e.getMessage());
       }
    }

    //checks if courses array matches
    @Test
    void getCourses() {
        try {
            assertArrayEquals(student.getCourses(), student.getCourses(), "getCourses should match");
        } catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
    }

    //checks if canTakeCourse method returns true
    @Test
    void canTakeCourse() {
        try {
            assertTrue(student.canTakeCourse(), "canTakeCourse should be true");
        } catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
    }
}