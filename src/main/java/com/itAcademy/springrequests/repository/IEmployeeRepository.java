package com.itAcademy.springrequests.repository;


import com.itAcademy.springrequests.dto.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IRepository extends JpaRepository<Employee, Long> {

}
