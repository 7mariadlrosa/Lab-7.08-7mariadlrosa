package com.example.Lab7.mariadlrosa.repository;

import com.example.Lab7.mariadlrosa.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
