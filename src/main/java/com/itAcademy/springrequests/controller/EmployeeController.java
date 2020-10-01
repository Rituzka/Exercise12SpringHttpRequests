package com.itAcademy.springrequests.controller;


import com.itAcademy.springrequests.repository.IEmployeeRepository;



public class EmployeeController {

    private final IEmployeeRepository repository;

    public EmployeeController(IEmployeeRepository repository){
        this.repository = repository;
    }
}
