package com.example.TP2.Services;

import com.example.TP2.Entities.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentServiceMock implements StudentService {

    private Map<Long, Student> studentMap;

    public StudentServiceMock() {
        this.studentMap = new HashMap<>();
        initializeMockData();
    }

    private void initializeMockData() {
        Student student1 = new Student(1, "John", "Doe", 20);
        Student student2 = new Student(2, "Jane", "Smith", 22);
        Student student3 = new Student(3, "Alice", "Johnson", 21);

        studentMap.put(student1.getId(), student1);
        studentMap.put(student2.getId(), student2);
        studentMap.put(student3.getId(), student3);
    }

    @Override
    public void createStudent(Student student) {
        // Pour cette simulation, nous ne faisons rien lors de la création d'un étudiant dans la version mock
    }

    @Override
    public Student findStudentById(long id) {
        return studentMap.get(id);
    }

    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<>(studentMap.values());
    }
}

