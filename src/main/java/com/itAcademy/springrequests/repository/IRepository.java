package com.itAcademy.springrequests.repository;

import com.itAcademy.springrequests.dto.Employee;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IRepository {

    //GET all Employees
    List<Employee> getEmployees();

    //GET one Employee
    Optional <Employee> getEmployeeById(UUID id);

    //POST insert a new Employee
    int insertEmployee(UUID id, Employee employee);

    //POST insert a new Employee without id (id random)
    default int insertEmployee(Employee employee){
        UUID id = UUID.randomUUID();
        return insertEmployee(id, employee);
    }

    //UPDATE data from an specific Employee
    int updateDataEmployee(UUID id, Employee employee);

    //DELETE an specific Employee
    int deleteEmployeeById(UUID id);


}
