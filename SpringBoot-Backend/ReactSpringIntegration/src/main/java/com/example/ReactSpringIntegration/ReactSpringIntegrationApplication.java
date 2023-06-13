package com.example.ReactSpringIntegration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.ReactSpringIntegration.Entity.Employee;
import com.example.ReactSpringIntegration.repository.EmployeeRepository;

import lombok.Singular;

@SpringBootApplication
public class ReactSpringIntegrationApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ReactSpringIntegrationApplication.class, args);
	}
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	
	public void run(String... args) throws Exception {
		
	}

}
