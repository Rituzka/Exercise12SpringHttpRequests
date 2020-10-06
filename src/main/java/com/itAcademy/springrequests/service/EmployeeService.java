package com.itAcademy.springrequests.service;

import com.itAcademy.springrequests.dto.Employee;
import com.itAcademy.springrequests.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EmployeeService implements IService {

    private final EmployeeRepository repository;

    @Autowired
    public EmployeeService(@Qualifier("firstRepository") EmployeeRepository repository) {
        this.repository = repository;
    }

   //get all employees from repository
    @Override
    public List<Employee> getAllEmployees() {
        return repository.getEmployees();
    }

    //get one Employee by id
    @Override
    public Optional <Employee> getEmployee(UUID id) {
        return repository.getEmployeeById(id);
    }

    // insert new Employee
    @Override
    public int createEmployee(UUID id, Employee employee) {
        return repository.insertEmployee(id, employee);
    }

    //update data from one employee
    @Override
    public int updateEmployee(UUID id, Employee employee) {
        return repository.updateDataEmployee(id, employee);
    }

    //delete one employee from repository
    @Override
    public int deleteEmployee(UUID id) {
        return repository.deleteEmployeeById(id);
    }
}
