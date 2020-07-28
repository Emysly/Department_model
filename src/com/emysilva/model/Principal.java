package com.emysilva.model;

import com.emysilva.util.PrincipalTeacherNonAcedmicStaffUtil;

public class Principal extends PrincipalTeacherNonAcedmicStaffUtil {

    public Principal(String firstname, String lastname, String role) {
        super(firstname, lastname, role);
    }

    public boolean canExpel() {
        return true;
    }

    public boolean canAdmit(int age) {
        if(age > 17)
            return true;
        return false;
    }

}
