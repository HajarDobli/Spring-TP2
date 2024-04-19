package com.example.TP2.Repositories;

import com.example.TP2.Entities.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryStudentRepository implements StudentRepository {

    private Map<Long, Student> studentMap;

    public InMemoryStudentRepository() {
        this.studentMap = new HashMap<>();
        initializeData();
    }

    private void initializeData() {
        Student student1 = new Student(1, "John", "Doe", 20);
        Student student2 = new Student(2, "Jane", "Smith", 22);
        Student student3 = new Student(3, "Alice", "Johnson", 21);

        studentMap.put(student1.getId(), student1);
        studentMap.put(student2.getId(), student2);
        studentMap.put(student3.getId(), student3);
    }

    @Override
    public void save(Student student) {
        studentMap.put(student.getId(), student);
    }

    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(studentMap.values());
    }
}

