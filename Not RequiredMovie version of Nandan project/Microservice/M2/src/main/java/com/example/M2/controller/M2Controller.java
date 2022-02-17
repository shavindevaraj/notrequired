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

    @GetMapping("/getAllRatings")
    public List<M2> getAllRatings() {
        return m2Service.getAllRatings();
    }

    @GetMapping("/get/{classBID}")
    public M2 getRating(@PathVariable String classBID) {
        return m2Service.getRating(classBID);
    }

    @GetMapping("/getrating/{classAId}")
    public M2 getMovieRating(@PathVariable String classAId) {
        return m2Service.getByMovieId(classAId);
    }

    @PostMapping("/createRating")
    public M2 createRating(@RequestBody M2 classB) {
        return m2Service.create(classB);
    }

    @DeleteMapping("/deleteRating/{classBId}")
    public String deleteRating(@PathVariable String classBId) {
        m2Service.delete(classBId);
        return "Rating Deleted";
    }

    @PutMapping("/updateRating/{classBId}")
    public M2 updateRating(@RequestBody M2 classB, @PathVariable String classBId) {
        return m2Service.update(classB, classBId);
    }

    @DeleteMapping("/deleteAll")
    public String deleteRatings() {
        m2Service.deleteAll();
        return "All Ratings data deleted";
    }
}
