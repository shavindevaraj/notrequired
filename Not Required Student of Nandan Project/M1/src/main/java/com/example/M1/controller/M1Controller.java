package com.example.M1.controller;

import com.example.M1.models.M1;
import com.example.M1.service.M1Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/field1")
@RestController
public class M1Controller {
    private final M1Service m1Service;

    public M1Controller(M1Service m1Service) {
        this.m1Service = m1Service;
    }
    @GetMapping("/getAllStudents")
    public List<M1> getAllStudents() {
        return m1Service.getAllStudents();
    }

    @GetMapping("/get/{classAID}")
    public M1 getStudent(@PathVariable String classAID) {
        return m1Service.getStudent(classAID);
    }

    @PostMapping("/createStudent")
    public M1 createStudent(@RequestBody M1 classA) {
        return m1Service.create(classA);
    }

    @DeleteMapping("/deleteStudent/{classAId}")
    public String deleteStudent(@PathVariable String classAId) {
        m1Service.delete(classAId);
        return "Movie Deleted";
    }

    @PutMapping("/updateStudent/{classAId}")
    public M1 updateStudent(@RequestBody M1 classA, @PathVariable String classAId) {
        return m1Service.update(classA, classAId);
    }

    @DeleteMapping("/deleteAll")
    public String deleteStudents() {
        m1Service.deleteAll();
        return "All Movies data deleted";
    }
}
