package com.robb.springbootudemy.DAO;

import com.robb.springbootudemy.Entities.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class StudentDAOImpl implements StudentDAO {

    // define and inject entityManager

    private EntityManager entityManager;

    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    // save method that adds student object to the database

    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);
    }
}
