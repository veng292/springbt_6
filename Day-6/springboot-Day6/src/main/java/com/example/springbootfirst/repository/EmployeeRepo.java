package com.example.springbootfirst.repository;

import com.example.springbootfirst.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

    List<Employee> findByJob(String job);

}
