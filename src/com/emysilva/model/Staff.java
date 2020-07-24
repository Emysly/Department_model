package com.emysilva.model;

import com.emysilva.model.non.academic.staff.NonAcademicStaff;
import com.emysilva.model.principal.Principal;
import com.emysilva.model.teacher.Teacher;

public class Staff {
    Principal principal;
    Teacher teacher;
    NonAcademicStaff nonAcademicStaff;

    public Staff(Principal principal, Teacher teacher, NonAcademicStaff nonAcademicStaff) {
        this.principal = principal;
        this.teacher = teacher;
        this.nonAcademicStaff = nonAcademicStaff;
    }

    public String display(){
        return "principal's name: " + principal.getFirstname()+" "+principal.getLastname()+"\n" +"teacher's name: " + teacher.getFirstname()+ " " + teacher.getLastname()+"\n" + "non academic staff's name: " + nonAcademicStaff.getFirstname()+" "+nonAcademicStaff.getLastname();
    }
}
