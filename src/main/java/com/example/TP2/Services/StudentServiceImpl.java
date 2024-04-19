package com.example.TP2.Services;

import com.example.TP2.Entities.Student;
import com.example.TP2.Repositories.StudentRepository;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    // Constructeur prenant un objet StudentRepository comme paramètre
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void createStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Student findStudentById(long id) {
        return studentRepository.findById(id);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}

