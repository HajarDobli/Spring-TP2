package com.example.TP2.Repositories;

import com.example.TP2.Entities.Student;

import java.util.List;

public interface StudentRepository {

    void save(Student student);

    Student findById(long id);

    List<Student> findAll();
}

