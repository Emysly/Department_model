package com.emysilva.model.clas;

import com.emysilva.model.clas.Class;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ClassTest {

    Class clas;

    @BeforeEach
    void setUp() {
        clas = new Class("Electrical wiring (EEE201)", "David Oguzie", "Power lab", new Date(), new String[]{"Mechanical Engineering", "Electrical and Electronics Engineering", "Computer Science"}, 200);
    }

    @Test
    void getCourse() {
        assertNotNull(clas.getCourse(), "getCourse should not be empty");
    }

    @Test
    void getTeacher() {
        assertNotNull(clas.getTeacher(), "getTeacher should not be empty");
    }

    @Test
    void getLocation() {
        assertNotNull(clas.getLocation(), "getLocation should not be empty");
    }

    @Test
    void getTime() {
        assertNotNull(clas.getTime(), "getTime should not be empty");
    }

    @Test
    void getDepartments() {
        assertArrayEquals(clas.getDepartments(), clas.getDepartments(), "getTeacher should match");
    }

    @Test
    void getLevel() {
        assertNotNull(clas.getLevel(), "getLevel should not be empty");
    }
}