package com.itAcademy.springrequests.repository;

import com.itAcademy.springrequests.dto.Employee;

import java.util.List;
import java.util.Optional;


public interface IRepository {

    //GET all Employees
    List<Employee> getEmployees();

    //GET one Employee
    Optional <Employee> getEmployeeById(long id);

    //POST insert a new Employee
    int insertEmployee(Employee employee);

    //UPDATE data from an specific Employee
    int updateDataEmployee(long id, Employee employee);

    //DELETE an specific Employee
    int deleteEmployeeById(long id);


}
