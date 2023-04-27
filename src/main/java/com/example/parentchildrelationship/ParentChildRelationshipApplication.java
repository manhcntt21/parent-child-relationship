package com.example.parentchildrelationship;

import com.example.parentchildrelationship.entity.Employee;
import com.example.parentchildrelationship.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ParentChildRelationshipApplication {

    public static void main(String[] args) {
        SpringApplication.run(ParentChildRelationshipApplication.class, args);
    }


    @Bean
    CommandLineRunner run(EmployeeRepository employeeRepository) {
        return args -> {
            Employee e1 = new Employee(null, "Manh", "Do", null);
            Employee e2 = new Employee(null, "Manh", "Do", null);
            Employee e3 = new Employee(null, "Manh", "Do", null);
            Employee e4 = new Employee(null, "Manh", "Do", e1);
            Employee e5 = new Employee(null, "Manh", "Do", e2);
            Employee e6 = new Employee(null, "Manh", "Do", e3);

            employeeRepository.save(e1);
            employeeRepository.save(e2);
            employeeRepository.save(e3);
            employeeRepository.save(e4);
            employeeRepository.save(e5);
            employeeRepository.save(e6);
        };
    }
}
