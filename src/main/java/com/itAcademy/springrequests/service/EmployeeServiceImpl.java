package com.itAcademy.springrequests.service;

import com.itAcademy.springrequests.dto.Employee;
import com.itAcademy.springrequests.exception.ResourceNotFoundException;
import com.itAcademy.springrequests.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    IEmployeeRepository repository;


    @Override
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    @Override
    public Employee getEmployeeById(long id) {
        Optional<Employee> employeeDb = repository.findById(id);

        if(employeeDb.isPresent())
            return employeeDb.get();
        else
            throw new ResourceNotFoundException("employee not found with id: "+ id);
    }

    @Override
    public void addEmployee(Employee employee) {
        repository.save(employee);

    }

    @Override
    public void updateEmployee(Employee employee) {
        Optional<Employee> employeeDb = repository.findById(employee.getId());

        if(employeeDb.isPresent()){
            Employee employeeToUpdate = employeeDb.get();
            employeeToUpdate.setId(employee.getId());
            employeeToUpdate.setName(employee.getName());
            employeeToUpdate.setSurname(employee.getSurname());
            employeeToUpdate.setRole(employee.getRole());

        } else {
            throw new ResourceNotFoundException("employee not found with id: "+ employee.getId());
        }
    }

    @Override
    public void deleteEmployee(long id) {

        Optional<Employee> employeeDb = repository.findById(id);

        if(employeeDb.isPresent())
            repository.delete(employeeDb.get());
        else
            throw new ResourceNotFoundException("employee not found with id: "+ id);

    }

}
