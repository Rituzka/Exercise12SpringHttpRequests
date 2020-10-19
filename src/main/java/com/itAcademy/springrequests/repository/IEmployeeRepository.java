package com.itAcademy.springrequests.repository;


import com.itAcademy.springrequests.dto.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IEmployeeRepository extends JpaRepository<Employee, Long> {

}
