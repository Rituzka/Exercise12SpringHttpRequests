package com.itAcademy.springrequests.controller;


import com.itAcademy.springrequests.dto.Employee;
import com.itAcademy.springrequests.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.UUID;


@RestController
public class EmployeeController {

    private final EmployeeService service;
    
    @Autowired
    public EmployeeController(EmployeeService service){
        this.service = service;
    }

    //get all the employees in a list
   @GetMapping
    public List<Employee> getAllEmployees(){
        return service.getAllEmployees();
   }

   //insert a new Employee in the list
   @PostMapping
    public void addEmployee(@RequestBody UUID id, Employee employee){
        service.createEmployee(id, employee);
   }
    
}
