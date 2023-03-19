package com.example.srpingbootrestcrud1employeemangament.controller;

import com.example.srpingbootrestcrud1employeemangament.repository.Employee;
import com.example.srpingbootrestcrud1employeemangament.repository.EmployeeDAO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class EmployeeRestController {

    private final EmployeeDAO employeeDAO;

    public EmployeeRestController(EmployeeDAO employeeDAO){
        this.employeeDAO = employeeDAO;
    }

    @GetMapping("/employee")
    public List<Employee> findAll(){
       return employeeDAO.findAll();
    }
}
