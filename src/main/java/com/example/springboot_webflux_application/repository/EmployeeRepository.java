package com.example.springboot_webflux_application.repository;


import com.example.springboot_webflux_application.entity.Employee;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface EmployeeRepository extends ReactiveCrudRepository<Employee, String> {
}
