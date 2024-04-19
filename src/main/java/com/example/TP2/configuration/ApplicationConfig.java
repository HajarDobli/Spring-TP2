package com.example.TP2.configuration;

import com.example.TP2.Repositories.InMemoryStudentRepository;
import com.example.TP2.Repositories.StudentRepository;
import com.example.TP2.Services.StudentService;
import com.example.TP2.Services.StudentServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public StudentService studentService() {
        return new StudentServiceImpl(studentRepository());
    }

    @Bean
    public StudentRepository studentRepository() {
        return new InMemoryStudentRepository();
    }
}
