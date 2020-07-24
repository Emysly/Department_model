package com.emysilva;

import com.emysilva.model.Staff;
import com.emysilva.model.clas.Class;
import com.emysilva.model.applicant.Applicant;
import com.emysilva.model.course.Course;
import com.emysilva.model.non.academic.staff.NonAcademicStaff;
import com.emysilva.model.principal.Principal;
import com.emysilva.model.student.Student;
import com.emysilva.model.teacher.Teacher;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Principal principal;
        Teacher teacher;
        NonAcademicStaff nonAcademicStaff;
        Student student;
        Course course;
        Class clas;
        Applicant applicant;



        principal = new Principal("Chika", "Nwobi", "Principal");
        teacher = new Teacher("David", "Oguzie", "Teacher", new String[]{"Mechanical Engineering", "Electrical and Electronics Engineering", "Computer Science"}, new String[]{"EEE201", "EEE321", "EEE521", "MEE201", "MME321", "CSC201", "CSC321"});
        nonAcademicStaff = new NonAcademicStaff("Lucky", "Gbenga", "Non-Academic Staff", "Mechanical Engineering");
        Staff staff = new Staff(principal, teacher, nonAcademicStaff);
        student = new Student("Chukwuebuka", "Emmanuel", "Student", "Electrical and Electronics Engineering", 27, 500, new String[]{"EEE521", "EEE502", "EEE504", "EEC344", "EEE570"});
        course = new Course("Electrical Installation (EEE521)", 500,"Electrical and Electronics Engineering", "David Oguzie", new Date());
        clas = new Class("Electrical wiring (EEE201)", "David Oguzie", "Power lab", new Date(), new String[]{"Mechanical Engineering", "Electrical and Electronics Engineering", "Computer Science"}, 200);
        applicant = new Applicant("Oladapo", "Oladokun", "Student", "Mechanical Engineerig", 28, 100, new Date());

        System.out.println(teacher.canTeachACourse());
        System.out.println(principal.canExpel());
        System.out.println(principal.canAdmit(student.getAge()));
        System.out.println(student.canTakeCourse());
        System.out.println(staff.display());
    }
}
