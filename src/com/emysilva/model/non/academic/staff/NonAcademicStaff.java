package com.emysilva.model.non.academic.staff;

import com.emysilva.model.principal.PrincipalTeacherNonAcedmicStaffUtil;

public class NonAcademicStaff extends PrincipalTeacherNonAcedmicStaffUtil {
    private String department;
    public NonAcademicStaff(String firstname, String lastname, String role, String department) {
        super(firstname, lastname, role);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "NonAcademicStaff{" +
                "department='" + department + '\'' +
                '}';
    }
}
