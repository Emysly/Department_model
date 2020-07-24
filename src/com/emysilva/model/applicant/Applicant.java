package com.emysilva.model.applicant;

import java.util.Date;

public class Applicant extends ApplicantModel {

    public Applicant(String firstname, String lastname, String role, String department, int age, int level, Date date) {
        super(firstname, lastname, role, department, age, level, date);
    }
}
