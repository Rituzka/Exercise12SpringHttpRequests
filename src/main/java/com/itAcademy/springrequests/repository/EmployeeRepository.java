package com.itAcademy.springrequests.repository;

import com.itAcademy.springrequests.dto.Employee;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class EmployeeRepository implements IRepository{
    @Override
    public List<Employee> getEmployees() {
        return null;
    }

    @Override
    public Optional<Employee> getEmployeeById(UUID id) {
        return Optional.empty();
    }

    @Override
    public int insertEmployee(UUID id, Employee employee) {
        return 0;
    }

    @Override
    public int updateDataEmployee(UUID id, Employee employee) {
        return 0;
    }

    @Override
    public int deleteEmployeeById(UUID id) {
        return 0;
    }
}
