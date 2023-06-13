package com.example.ReactSpringIntegration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ReactSpringIntegration.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
