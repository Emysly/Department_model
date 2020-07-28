package com.emysilva.util;

public class PrincipalTeacherNonAcedmicStaffUtil {
    private String firstname;
    private String lastname;
    private String role;

    //principal constructor
    public PrincipalTeacherNonAcedmicStaffUtil(String firstname, String lastname, String role) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.role = role;
    }

    //firstname getter
    public String getFirstname() {
        return firstname;
    }

    //firstname setter
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    //lastname getter
    public String getLastname() {
        return lastname;
    }

    //lastname setter
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    //role getter
    public String getRole() {
        return role;
    }

    //role setter
    public void setRole(String role) {
        this.role = role;
    }

    //concat all attributes to string
    @Override
    public String toString() {
        return "PrincipalModel{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
