package com.itAcademy.springrequests.dto;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

enum Role {
    Director, Manager, Supervisor, Coordinator, Staff
}

@Entity
public class Employee {

    private @GeneratedValue Long id;
    private final String name;
    private final String surname;
    double salary;
    Role role;

    public Employee(String name, String surname,double salary, Role role) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.role = role;
    }
    
    public Long getId() {
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
