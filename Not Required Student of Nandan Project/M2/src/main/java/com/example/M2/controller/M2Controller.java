package com.example.M2.controller;

import com.example.M2.models.M2;
import com.example.M2.service.M2Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/field2")
@RestController
public class M2Controller {
    private final M2Service m2Service;

    public M2Controller(M2Service m2Service) {
        this.m2Service = m2Service;
    }

    @GetMapping("/getAllCourses")
    public List<M2> getAllCourses() {
        return m2Service.getAllCourses();
    }

    @GetMapping("/get/{classBID}")
    public M2 getCourse(@PathVariable String classBID) {
        return m2Service.getCourse(classBID);
    }

    @GetMapping("/getCourse/{classAId}")
    public M2 getStudent(@PathVariable String classAId) {
        return m2Service.getByStudentId(classAId);
    }

    @PostMapping("/createCourse")
    public M2 createCourse(@RequestBody M2 classB) {
        return m2Service.create(classB);
    }

    @DeleteMapping("/deleteCourse/{classBId}")
    public String deleteCourse(@PathVariable String classBId) {
        m2Service.delete(classBId);
        return "Rating Deleted";
    }

    @PutMapping("/updateCourse/{classBId}")
    public M2 updateCourse(@RequestBody M2 classB, @PathVariable String classBId) {
        return m2Service.update(classB, classBId);
    }

    @DeleteMapping("/deleteAll")
    public String deleteCourses() {
        m2Service.deleteAll();
        return "All Ratings data deleted";
    }
}
