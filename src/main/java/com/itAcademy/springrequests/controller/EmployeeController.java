package com.itAcademy.springrequests.controller;

import com.itAcademy.springrequests.dto.Employee;
import com.itAcademy.springrequests.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/employees")
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
    @GetMapping(path = "{id}")
    public Optional<Employee> getOneEmployee(@PathVariable(name = "id") long id) {
        return service.getEmployee(id);
    }

   //Create a new Employee in the list (REVISAR)
   @PostMapping("/new")
    public void addEmployee( @NonNull @RequestBody Employee employee){
        service.createEmployee(employee);
   }

   //Update one employee with id
    @PutMapping("/update/{id}")
    public void updateEmployee(@PathVariable("id") long id, @NonNull @RequestBody Employee employee){
        service.updateEmployee(id, employee);
    }

    //Delete one employee with id
    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable("id") long id){
        service.deleteEmployee(id);
    }
}
