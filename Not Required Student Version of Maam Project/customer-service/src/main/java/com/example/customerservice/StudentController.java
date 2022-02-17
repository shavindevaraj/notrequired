package com.example.customerservice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
@RequestMapping("/students")
@RestController
public class StudentController {
    private List<Student> students = Arrays.asList(
            new Student(1, "Joe Bloggs","Ramaiah"),
            new Student(2, "Jane Doe","PES"));
    
    @GetMapping
    public List<Student> getStudents() {
        return students;
    }
    
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id) {
        return students.stream()
                        .filter(student -> student.getId() == id)
                        .findFirst()
                        .orElseThrow(IllegalArgumentException::new);
    }
}