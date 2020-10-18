package com.itAcademy.springrequests.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    public enum Role {
        Director, Manager, Supervisor, Coordinator, Staff
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String surname;
    private Role role;
    private double salary;

   //Constructor
    public Employee(
            @JsonProperty("id") Long id,
            @JsonProperty("name") String name,
            @JsonProperty("surname") String surname,
            @JsonProperty("role")Role role

    ) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.role = role;
        this.salary = calculateSalary(role);
    }

    //Getters & setters
    public long getId() {
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

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double calculateSalary(Role role) {

        switch(role){
            case Director: salary = 350000;break;
            case Manager: salary = 210000;break;
            case Supervisor: salary = 100000; break;
            case Coordinator: salary = 70000;break;
            case Staff: salary = 30000;break;
            default: salary = 0;
        }
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", role=" + role +
                ", salary=" + salary +
                '}';
    }
}
