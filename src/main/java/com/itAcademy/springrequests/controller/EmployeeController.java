package com.itAcademy.springrequests.controller;


import com.itAcademy.springrequests.repository.IRepository;



public class EmployeeController {

    private final IRepository repository;

    public EmployeeController(IRepository repository){
        this.repository = repository;
    }
}
