package com.robb.springbootudemy.DAO;

import com.robb.springbootudemy.Entities.Student;

import java.util.List;

public interface StudentDAO {

    public void save(Student student);

    public Student read(Integer id);

    public List<Student> findAll();

    public List<Student> findByLastName(String lastName);

    public void update(Student student);

    public void delete(Integer id);

    public int deleteAll();
}
