package com.itAcademy.springrequests.repository;

import com.itAcademy.springrequests.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Repository("firstRepository")
public class EmployeeRepository implements IRepository{


    private final static List<Employee> allEmployees = new ArrayList<>();


    //get all employees
    @Override
    public List<Employee> getEmployees() {
        return allEmployees;
    }


    //get one employee
    @Override
    public Optional<Employee> getEmployeeById(UUID id) {
       return allEmployees.stream()
               .filter(employee -> employee.getId().equals(id))
               .findFirst();

    }
    //insert a new Employee
    @Override
    public int insertEmployee(UUID id, Employee employee) {
        allEmployees.add(
                new Employee(id,
                        employee.getName(),
                        employee.getSurname(),
                        employee.getRole(),
                        employee.getSalary()));
        return 1;
    }

//update one employee data
    @Override
    public int updateDataEmployee(UUID id, Employee employee) {
        Optional<Employee> employeeToUpdate = getEmployeeById(id);
        if (employeeToUpdate.isPresent()) {
            allEmployees.set(allEmployees.indexOf(employeeToUpdate),
                    new Employee(id,
                            employee.getName(),
                            employee.getSurname(),
                            employee.getRole(),
                            employee.getSalary()));
            return 1;
        }
        return 0;
    }

   //remove one employee from list
    @Override
    public int deleteEmployeeById(UUID id) {
        Optional<Employee> employeeToDelete = getEmployeeById(id);
        if(employeeToDelete.isPresent()) {
            allEmployees.remove(employeeToDelete.get());
            return 1;
        }
        return 0;
    }
}
