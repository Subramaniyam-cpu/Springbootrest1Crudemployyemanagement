package com.example.srpingbootrestcrud1employeemangament.controller;

import com.example.srpingbootrestcrud1employeemangament.dto.EmployeeDTO;
import com.example.srpingbootrestcrud1employeemangament.entity.Employee;

import com.example.srpingbootrestcrud1employeemangament.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class EmployeeRestController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/employee")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @GetMapping("/employee/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId) {

        Employee employee = employeeService.findById(employeeId);
        if (employee == null){
            throw new RuntimeException("Employee id is not found "+ employeeId);
        }

        return employee;
    }

    @PostMapping("/employee/addEmployee")
    public Employee addEmployee(@RequestBody EmployeeDTO employeeDTO){

        return employeeService.save(employeeDTO);
    }

    @PutMapping("/employee")
    public Employee updateEmployee(@RequestBody EmployeeDTO employeeDTO){
        return employeeService.save(employeeDTO);
    }

    @DeleteMapping("/employee/{emp_id}")
    public String deleteEmployee(@PathVariable int emp_id){


        return employeeService.deleteById(emp_id);
    }
    }


