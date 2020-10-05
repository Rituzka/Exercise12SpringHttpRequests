package com.itAcademy.springrequests.repository;

import com.itAcademy.springrequests.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class EmployeeRepository implements IRepository{

    @Autowired
    private Employee employee;
    private final static List<Employee> allEmployees = new ArrayList<>();

    @Override
    public List<Employee> getEmployees() {
        return allEmployees;
    }

    @Override
    public Optional<Employee> getEmployeeById(UUID id) {
        return allEmployees.stream()
                .filter(employee -> employee.getId().equals(id))
                .findFirst();
    }

    @Override
    public int insertEmployee(UUID id, Employee employee) {
        allEmployees.add(
                new Employee(id, employee.getName(), employee.getSurname(),
                        employee.getRole(), employee.getSalary()));
        return 1;
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
