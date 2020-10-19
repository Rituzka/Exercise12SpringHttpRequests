package com.itAcademy.springrequests.service;

import com.itAcademy.springrequests.dto.Employee;

import java.util.List;
import java.util.Optional;


public interface IService {

  //get all employees
  List<Employee> getAllEmployees();

  //get one employee with an id
  Employee getEmployeeById(long id);

  //insert new Employee
  Employee addEmployee(Employee employee);

  //update data from an Employee
   Employee updateEmployee(long id, Employee employee);

  //delete an Employee from list
   void deleteEmployee(long id);

}
