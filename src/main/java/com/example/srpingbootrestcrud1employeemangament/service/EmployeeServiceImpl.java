package com.example.srpingbootrestcrud1employeemangament.service;

import com.example.srpingbootrestcrud1employeemangament.dto.EmployeeDTO;
import com.example.srpingbootrestcrud1employeemangament.entity.Employee;
import com.example.srpingbootrestcrud1employeemangament.repository.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    public Employee findById(int theId) {
        return employeeDAO.findById(theId);
    }
    @Transactional
    @Override
    public Employee save(EmployeeDTO theEmployee) {
        return employeeDAO.save(theEmployee);
    }

    @Transactional
    @Override
    public void deleteById(int theId) {

         employeeDAO.deleteById(theId);

    }
}
