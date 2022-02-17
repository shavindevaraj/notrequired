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
    @GetMapping("/getAllMovies")
    public List<M1> getAllMovies() {
        return m1Service.getAllMovies();
    }

    @GetMapping("/get/{classAID}")
    public M1 getMovie(@PathVariable String classAID) {
        return m1Service.getMovie(classAID);
    }

    @PostMapping("/createMovie")
    public M1 createMovie(@RequestBody M1 classA) {
        return m1Service.create(classA);
    }

    @DeleteMapping("/deleteMovie/{classAId}")
    public String deleteMovie(@PathVariable String classAId) {
        m1Service.delete(classAId);
        return "Movie Deleted";
    }

    @PutMapping("/updateMovie/{classAId}")
    public M1 updateMovie(@RequestBody M1 classA, @PathVariable String classAId) {
        return m1Service.update(classA, classAId);
    }

    @DeleteMapping("/deleteAll")
    public String deleteMovies() {
        m1Service.deleteAll();
        return "All Movies data deleted";
    }
}
