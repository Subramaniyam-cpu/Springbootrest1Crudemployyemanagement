package com.example.srpingbootrestcrud1employeemangament.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
}
