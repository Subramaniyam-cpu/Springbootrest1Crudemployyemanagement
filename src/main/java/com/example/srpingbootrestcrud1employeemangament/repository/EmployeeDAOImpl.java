package com.example.srpingbootrestcrud1employeemangament.repository;

import com.example.srpingbootrestcrud1employeemangament.dto.EmployeeDTO;
import com.example.srpingbootrestcrud1employeemangament.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.modelmapper.ModelMapper;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;


@Repository
public class EmployeeDAOImpl implements EmployeeDAO {


    private final EntityManager entityManager;


    @Autowired
    public EmployeeDAOImpl(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }
    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee>  theQuery = entityManager.createQuery("from Employee ", Employee.class);

        return theQuery.getResultList();
    }

    @Override
    public Employee findById(int theId) {

        return entityManager.find(Employee.class, theId);
    }

    @Override
    public Employee save(EmployeeDTO theEmployee) {
        ModelMapper modelMapper = new ModelMapper();
        Employee employee = modelMapper.map(theEmployee, Employee.class);
         entityManager.persist(employee);
      return  employee;
    }


    @Override
    public void deleteById(int theId) {

        Employee employee = entityManager.find(Employee.class ,theId);
        entityManager.remove(employee);

    }
}
