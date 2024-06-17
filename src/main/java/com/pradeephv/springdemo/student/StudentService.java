package com.pradeephv.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

//    Student save(Student s);
//    List<Student> findAllStudents();
//    Student findByEmail(String email);
//    Student update(Student s);
//    void delete(String email);


    public List<Student> findallStudent(){
        return List.of(
                new Student(
                        "abbbbcc",
                        "ahhh",
                        LocalDate.now(),
                        "a@",
                        7
                )
        );
    }
}
