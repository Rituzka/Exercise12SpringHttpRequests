package com.itAcademy.springrequests.service;

import com.itAcademy.springrequests.dto.Employee;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IService {

  List<Employee> getAllEmployees();

  Optional<Employee> getEmployee(UUID id);

  int createEmployee(UUID id, Employee employee);

  int deleteEmployee(UUID id);

  int updateEmployee(UUID id, Employee employee);

}
