package com.itAcademy.springrequests.dto;


import javax.persistence.Entity;
import java.util.UUID;

enum Role {
    Director, Manager, Supervisor, Coordinator, Staff
}

@Entity
public class Employee {

    private final UUID id;
    private final String name;
    private final String surname;
    Role role;
    double salary;


    public Employee(UUID id, String name, String surname, Role role, double salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.role = role;
        this.salary = salary;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Role getRole() {
        return role;
    }

    public void getSalary() {
        switch(role){
            case Director: salary = 350000;break;
            case Manager: salary = 210000;break;
            case Supervisor: salary = 100000; break;
            case Coordinator: salary = 70000;break;
            case Staff: salary = 30000;break;
            default: salary = 0;
        }
    }
}
