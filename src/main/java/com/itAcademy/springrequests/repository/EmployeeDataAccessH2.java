package com.itAcademy.springrequests.repository;

import com.itAcademy.springrequests.dto.Employee;


import java.util.List;
import java.util.Optional;

public class EmployeeDataAccessH2 implements IRepository{
    @Override
    public List<Employee> getEmployees() {
       return 
    }

    @Override
    public Optional<Employee> getEmployeeById(long id) {
        return Optional.empty();
    }

    @Override
    public int insertEmployee(Employee employee) {
        return 0;
    }

    @Override
    public int updateDataEmployee(long id, Employee employee) {
        return 0;
    }

    @Override
    public int deleteEmployeeById(long id) {
        return 0;
    }
}
