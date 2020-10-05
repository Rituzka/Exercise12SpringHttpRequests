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
    public EmployeeService(@Qualifier("fakeRepository") EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return repository.getEmployees();
    }

    @Override
    public Optional<Employee> getEmployee(UUID id) {
        return repository.getEmployeeById(id);
    }

    @Override
    public int createEmployee(UUID id, Employee employee) {
        return 1;
    }

    @Override
    public int deleteEmployee(UUID id) {
        return 0;
    }

    @Override
    public int updateEmployee(UUID id, Employee employee) {
        return 0;
    }
}
