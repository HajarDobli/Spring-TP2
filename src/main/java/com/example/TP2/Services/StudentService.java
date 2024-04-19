package com.example.TP2.Services;

import com.example.TP2.Entities.Student;

import java.util.List;

public interface StudentService {

    // Méthode pour créer un nouvel étudiant
    void createStudent(Student student);

    // Méthode pour rechercher un étudiant par ID
    Student findStudentById(long id);

    // Méthode pour récupérer la liste de tous les étudiants
    List<Student> getAllStudents();
}

