package com.example.M1.service;

import com.example.M1.models.M1;
import com.example.M1.repository.M1Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class M1Service {

    private final M1Repository m1Repository;

    public M1Service(M1Repository m1Repository) {
        this.m1Repository = m1Repository;
    }

    public List<M1> getAllMovies() {
        return m1Repository.findAll();
    }

    public M1 getMovie(String classAID) {
        return m1Repository.findById(classAID).orElse(null);
    }

    public M1 create(M1 classA) {
        return m1Repository.save(classA);
    }

    public void delete(String classAId) {
        m1Repository.deleteById(classAId);
    }

    public M1 update(M1 classA, String classAId) {
        M1 classA1 = m1Repository.findById(classAId).get();
        classA1.setName(classA.getName());
        classA1.setDescription(classA.getDescription());
        m1Repository.save(classA1);
        return classA1;
    }

    public void deleteAll() {
        m1Repository.deleteAll();
    }
}
