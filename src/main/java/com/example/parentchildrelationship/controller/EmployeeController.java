package com.example.parentchildrelationship.controller;

import com.example.parentchildrelationship.repository.EmployeeRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author manhdt14
 * created in 4/28/2023 5:26 AM
 */
@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping
    public ResponseEntity<?> get() {
        return ResponseEntity.ok(employeeRepository.findAll());
    }
}
