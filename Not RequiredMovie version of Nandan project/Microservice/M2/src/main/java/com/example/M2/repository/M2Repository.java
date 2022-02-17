package com.example.M2.repository;

import com.example.M2.models.M2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface M2Repository extends JpaRepository<M2, String> {
    public M2 findByClassAId(String classAId);
}
