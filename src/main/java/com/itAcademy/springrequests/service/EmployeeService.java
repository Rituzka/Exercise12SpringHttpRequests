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
public class EmployeeService {

    private final EmployeeRepository repository;

    @Autowired
    public EmployeeService(@Qualifier("fakeRepository") EmployeeRepository repository) {
        this.repository = repository;
    }
    //get all employees from repository
    public List<Employee> getAllEmployees(){
        return repository.getEmployees();
    }

    //get employee by id
    public Optional<Employee> getEmployeeById(UUID id){
        return repository.getEmployeeById(id);
    }
    

}
