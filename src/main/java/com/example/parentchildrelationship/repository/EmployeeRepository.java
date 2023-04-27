package com.example.parentchildrelationship.repository;

import com.example.parentchildrelationship.entity.Employee;
import org.springframework.data.repository.CrudRepository;

/**
 * @author manhdt14
 * created in 4/28/2023 5:01 AM
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
