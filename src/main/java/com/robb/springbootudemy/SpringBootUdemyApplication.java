package com.robb.springbootudemy;

import com.robb.springbootudemy.DAO.StudentDAO;
import com.robb.springbootudemy.Entities.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootUdemyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootUdemyApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        return runner -> {
            createStudent(studentDAO);
        };
    }

    private void createStudent(StudentDAO studentDAO) {
        System.out.println("Creating student...");
        Student student = new Student("Robert", "Barrett", "roborobbie123@gmail.com");

        System.out.println("Saving student...");
        studentDAO.save(student);

        System.out.println("Student id: " + student.getId());
    }

}
