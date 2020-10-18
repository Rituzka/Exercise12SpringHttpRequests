package com.itAcademy.springrequests.repository;

import com.itAcademy.springrequests.dto.Employee;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Repository("DummyRepository")
public class EmployeeRepository implements IRepository{

    private final List<Employee> allEmployees = new ArrayList<>();

    //get all employees
    @Override
    public List<Employee> selectAllEmployees() {
        return allEmployees;
    }

    //get one employee
    @Override
    public Optional<Employee> selectEmployeeById(long id) {
        return allEmployees.stream()
                .filter(employee -> employee.getId() == id)
                .findFirst();
    }
    //insert a new Employee
    @Override
    public int insertNewEmployee(Employee employee) {
        allEmployees.add(
                new Employee(
                        employee.getId(),
                        employee.getName(),
                        employee.getSurname(),
                        employee.getRole()
                ));
        return 1;
    };

//update one employee data
    @Override
    public int updateEmployeeById(long id, Employee employee) {
        Optional<Employee> employeeToUpdate = selectEmployeeById(id);
        if (employeeToUpdate.isPresent()) {
            allEmployees.set(allEmployees.indexOf(employeeToUpdate),
                    new Employee(id,
                            employee.getName(),
                            employee.getSurname(),
                            employee.getRole()
                            ));
            return 1;
        }
        return 0;
    }

   //remove one employee from list
    @Override
    public int deleteEmployeeById(long id) {
        Optional<Employee> employeeToDelete = selectEmployeeById(id);
        if(employeeToDelete.isPresent()) {
            allEmployees.remove(employeeToDelete.get());
            return 1;
        }
        return 0;
    }
}
