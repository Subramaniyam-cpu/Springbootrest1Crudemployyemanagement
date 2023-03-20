package com.example.srpingbootrestcrud1employeemangament.repository;

import com.example.srpingbootrestcrud1employeemangament.dto.EmployeeDTO;
import com.example.srpingbootrestcrud1employeemangament.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
    Employee findById(int theId);

    Employee save(EmployeeDTO theEmployee);

    String deleteById(int theId);


}
