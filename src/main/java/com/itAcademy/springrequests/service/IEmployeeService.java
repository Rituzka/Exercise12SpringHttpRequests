package com.itAcademy.springrequests.service;

import com.itAcademy.springrequests.dto.Employee;

import java.util.List;



public interface IEmployeeService {

  //get all employees
  List<Employee> getAllEmployees();

  //get one employee with an id
  Employee getEmployeeById(long id);

  //insert new Employee
   void addEmployee(Employee employee);

  //update data from an Employee
   void updateEmployee(Employee employee);

  //delete an Employee from list
   void deleteEmployee(long id);

}
