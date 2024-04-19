package com.example.TP2;
import com.example.TP2.Entities.Student;
import com.example.TP2.Services.StudentService;
import com.example.TP2.configuration.ApplicationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tp2Application {

	public static void main(String[] args) {
		SpringApplication.run(Tp2Application.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		StudentService studentService = context.getBean(StudentService.class);


		Student newStudent = new Student(4, "Emma", "Watson", 23);
		studentService.createStudent(newStudent);

		// trouvons l etudiant a travers son ID
		Student foundStudent = studentService.findStudentById(4);
		System.out.println("Found student: " + foundStudent);

		// recuperation de la liste des etudiants
		System.out.println("All students:");
		for (Student student : studentService.getAllStudents()) {
			System.out.println(student);
		}

		context.close();
	}


}
