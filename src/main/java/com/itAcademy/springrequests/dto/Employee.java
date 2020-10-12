package com.itAcademy.springrequests.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;


import javax.persistence.*;


/*enum Role {
    Director, Manager, Supervisor, Coordinator, Staff
}*/
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final long id;
    @NotNull
    private final String name;
    @NotNull
    private final String surname;
    @NotNull
    private final String role;
    @NotNull
    private final double salary;

   //Constructor
    public Employee(
            @JsonProperty("id") long id,
            @JsonProperty("name") String name,
            @JsonProperty("surname") String surname,
            @JsonProperty("role")String role,
            @JsonProperty("salary")double salary
    ) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.role = role;
        this.salary = salary;
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

    public String getRole() {
        return role;
    }

    public double getSalary() {
        return salary;
    }

    /*public double getSalary() {
        switch(role){
            case Director: salary = 350000;break;
            case Manager: salary = 210000;break;
            case Supervisor: salary = 100000; break;
            case Coordinator: salary = 70000;break;
            case Staff: salary = 30000;break;
            default: salary = 0;
        }
        return salary;
    }*/

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
