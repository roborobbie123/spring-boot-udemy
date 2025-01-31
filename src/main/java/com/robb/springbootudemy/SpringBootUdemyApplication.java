package com.robb.springbootudemy;

import com.robb.springbootudemy.DAO.StudentDAO;
import com.robb.springbootudemy.Entities.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class SpringBootUdemyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootUdemyApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        return runner -> {
             createStudents(studentDAO);

            // readStudent(studentDAO);

            //getStudents(studentDAO);

            //getStudentByLastName(studentDAO);

            //updateStudent(studentDAO);

            //removeStudent(studentDAO);

            // deleteStudents(studentDAO);
        };
    }

    private void deleteStudents(StudentDAO studentDAO) {
        int num = studentDAO.deleteAll();
        System.out.println("Deleted " + num + " students");
    }

    private void removeStudent(StudentDAO studentDAO) {
        studentDAO.delete(2);
    }

    private void updateStudent(StudentDAO studentDAO) {

        Student student = studentDAO.read(3);
        student.setEmail("jaydendaniels5@gmail.com");
        studentDAO.update(student);
    }

    private void getStudentByLastName(StudentDAO studentDAO) {
        List<Student> students = studentDAO.findByLastName("Barrett");
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

    private void getStudents(StudentDAO studentDAO) {
        List<Student> students = studentDAO.findAll();
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

    // reads a student from the database by id
    private void readStudent(StudentDAO studentDAO) {
        Student student = studentDAO.read(2);
        System.out.println("Student: " + student.toString());
    }

    // creates student objects and saves them to database
    private void createStudents(StudentDAO studentDAO) {
        System.out.println("Creating students...");
        Student student1 = new Student("Robert", "Barrett", "roborobbie123@gmail.com");
        Student student2 = new Student("Trey", "Lance", "treylance@gmail.com");
        Student student3 = new Student("Jayden", "Daniels", "jd5@gmail.com");

        System.out.println("Saving students...");
        studentDAO.save(student1);
        studentDAO.save(student2);
        studentDAO.save(student3);

        System.out.println("Student id: " + student1.getId());
        System.out.println("Student id: " + student2.getId());
        System.out.println("Student id: " + student3.getId());
    }

}
