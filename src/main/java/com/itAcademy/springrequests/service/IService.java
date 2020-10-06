package com.itAcademy.springrequests.service;

import com.itAcademy.springrequests.dto.Employee;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IService {

  //get all employees
  List<Employee> getAllEmployees();

  //get one employee with an id
  Optional<Employee> getEmployee(UUID id);

  //insert new Employee
  int createEmployee(UUID id, Employee employee);

  //update data from an Employee
  int updateEmployee(UUID id, Employee employee);

  //delete an Employee from list
  int deleteEmployee(UUID id);

}
