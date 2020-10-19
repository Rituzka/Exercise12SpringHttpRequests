package com.itAcademy.springrequests.controller;


import com.itAcademy.springrequests.dto.Employee;
import com.itAcademy.springrequests.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl service;


    //get all the employees in a list
    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return service.getAllEmployees();
    }

    //get one employee from the list
    @GetMapping(path = "/employees/{id}")
    public Employee getOneEmployee(@PathVariable(name = "id") long id) {
        return service.getEmployeeById(id);
    }

    //Add a new Employee in the list (REVISAR)
    @PostMapping("/employees")
    public void addEmployee(@RequestBody Employee employee){
        service.addEmployee(employee);
    }

    //Update one employee with id
    @PutMapping("/employees/{id}")
    public void updateEmployee(@PathVariable("id") long id, @RequestBody Employee employee){
        employee.setId(id);
        service.updateEmployee(employee);
    }

    //Delete one employee with id
    @DeleteMapping("/employees/{id}")
    public HttpStatus deleteEmployee(@PathVariable("id") long id){
        service.deleteEmployee(id);
        return HttpStatus.OK;

    }
}

