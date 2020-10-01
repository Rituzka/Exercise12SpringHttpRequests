package com.itAcademy.springrequests.dto;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class EmployeeResponseDto {

    private @GeneratedValue Long id;
    private String name;
    private String surname;
    private String role;

    public EmployeeResponseDto(String name, String surname, String role) {
        this.name = name;
        this.surname = surname;
        this.role = role;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
