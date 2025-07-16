package com.example.springbootfirst.repository;

import com.example.springbootfirst.models.RegisterDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository  //it is optional
public interface RegisterDetailsRepo extends JpaRepository<RegisterDetails, Integer> {
    RegisterDetails findByEmail(String email);
}
