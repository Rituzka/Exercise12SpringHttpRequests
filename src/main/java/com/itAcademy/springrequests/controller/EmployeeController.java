package com.itAcademy.springrequests.controller;


import com.itAcademy.springrequests.dto.Employee;
import com.itAcademy.springrequests.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
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

   //get one employee from the list
    @GetMapping
    public Optional<Employee> getOneEmployee(UUID id) {
        return service.getEmployee(id);
    }

   //Create a new Employee in the list (REVISAR)
   @PostMapping(path = {"id"})
    public void addEmployee(@PathVariable("id") UUID id, @RequestBody Employee employee){
        service.createEmployee(id, employee);
   }

   //Update one employee with id
    @PutMapping(path = {"id"})
    public void updateEmployee(@PathVariable("id") UUID id, @RequestBody Employee employee){
        service.updateEmployee(id, employee);
    }

    //Delete one employee with id
    @DeleteMapping(path = {"id"})
    public void deleteEmployee(@PathVariable("id") UUID id){
        service.deleteEmployee(id);
    }



    
}
