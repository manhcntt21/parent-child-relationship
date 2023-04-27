package com.example.parentchildrelationship.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

/**
 * @author manhdt14
 * created in 4/28/2023 4:58 AM
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    public Employee(Long id, String firstName, String lastName, Employee parent) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.parent = parent;
    }

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "manager_id")
    protected Employee parent;

    @JsonBackReference
    @OneToMany(mappedBy = "parent")
    protected Set<Employee> children;
}
