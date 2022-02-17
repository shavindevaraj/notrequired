package com.example.M2.service;

import com.example.M2.models.M2;
import com.example.M2.repository.M2Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class M2Service {

    private final M2Repository m2Repository;

    public M2Service(M2Repository m2Repository) {
        this.m2Repository = m2Repository;
    }

    public List<M2> getAllCourses() {
        return m2Repository.findAll();
    }

    public M2 getCourse(String classBID) {
        return m2Repository.findById(classBID).orElse(null);
    }

    public M2 create(M2 classB) {
        return m2Repository.save(classB);
    }

    public void delete(String classBId) {
        m2Repository.deleteById(classBId);
    }

    public M2 update(M2 classB, String classBId) {
        M2 classB1 = m2Repository.findById(classBId).get();
        classB1.setStudentId(classB.getStudentId());
        classB1.setCourse(classB.getCourse());
        m2Repository.save(classB1);
        return classB1;
    }

    public M2 getByStudentId(String classAId) {
        return m2Repository.findByClassAId(classAId);
    }

    public void deleteAll() {
        m2Repository.deleteAll();
    }
}
