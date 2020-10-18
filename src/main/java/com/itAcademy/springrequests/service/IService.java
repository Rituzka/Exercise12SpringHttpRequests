package com.itAcademy.springrequests.service;

import com.itAcademy.springrequests.dto.Employee;

import java.util.List;
import java.util.Optional;


public interface IService {

  //get all employees
  List<Employee> getAllEmployees();

  //get one employee with an id
  Optional<Employee> getEmployee(long id);

  //insert new Employee
  void addEmployee(Employee employee);

  //update data from an Employee
  void updateEmployee(long id, Employee employee);

  //delete an Employee from list
  void deleteEmployee(long id);

}
