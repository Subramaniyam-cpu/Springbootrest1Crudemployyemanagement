package com.example.srpingbootrestcrud1employeemangament.repository;

import com.example.srpingbootrestcrud1employeemangament.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
