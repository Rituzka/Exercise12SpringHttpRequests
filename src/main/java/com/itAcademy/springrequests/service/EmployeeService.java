package com.itAcademy.springrequests.service;

import com.itAcademy.springrequests.dto.Employee;
import com.itAcademy.springrequests.repository.IRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IService {

    private final IRepository repository;

    @Autowired
    public EmployeeService (@Qualifier("DummyRepository") IRepository repository) {
        this.repository = repository;
    }

   //get all employees from repository
    @Override
    public List<Employee> getAllEmployees() {
        return repository.selectAllEmployees();
    }

    //get one Employee by id
    @Override
    public Optional <Employee> getEmployee(long id) {
        return repository.selectEmployeeById(id);
    }

    // Create new Employee
    @Override
    public void addEmployee(Employee employee) {
        repository.insertNewEmployee(employee);
    }

    //update data from one employee
    @Override
    public void updateEmployee(long id, Employee employee) {
        repository.updateEmployeeById(id, employee);
    }

    //delete one employee from repository
    @Override
    public void deleteEmployee(long id) {
        repository.deleteEmployeeById(id);
    }
}
