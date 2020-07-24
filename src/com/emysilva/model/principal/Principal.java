package com.emysilva.model.principal;

public class Principal extends PrincipalModel {

    public Principal(String firstname, String lastname, String role) {
        super(firstname, lastname, role);
    }

    public boolean canExpel() {
        return true;
    }

    public boolean canAdmit(int age) {
        if(age < 19)
            return true;
        return false;
    }

}
