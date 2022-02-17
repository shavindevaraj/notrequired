package com.example.M1.repository;

import com.example.M1.models.M1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface M1Repository extends JpaRepository<M1, String> {
}
