package com.example.demo.DTOs;

public class RoleDTO {

    private String firstName;
    private String lastName;
    private String nicNo;

    public RoleDTO(){}

    public RoleDTO(String firstName, String lastName, String nicNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nicNo = nicNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNicNo() {
        return nicNo;
    }

    public void setNicNo(String nicNo) {
        this.nicNo = nicNo;
    }
}
