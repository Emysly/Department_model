package com.emysilva.model;

import com.emysilva.util.ApplicantUtil;

import java.util.Date;

public class Applicant extends ApplicantUtil {

    public Applicant(String firstname, String lastname, String role, String department, int age, int level, Date date) {
        super(firstname, lastname, role, department, age, level, date);
    }
}
