package com.itAcademy.springrequests.repository;

import com.itAcademy.springrequests.dto.Employee;

import java.util.List;
import java.util.Optional;


public interface IRepository {

    //GET all Employees
    List<Employee> selectAllEmployees();

    //GET one Employee
    Optional <Employee> selectEmployeeById(long id);

    //POST insert a new Employee
    int insertNewEmployee(Employee employee);

    //UPDATE data from an specific Employee
    int updateEmployeeById(long id, Employee employee);

    //DELETE an specific Employee
    int deleteEmployeeById(long id);


}
