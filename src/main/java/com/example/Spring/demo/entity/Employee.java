package com.example.Spring.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String department;
    private double salary;
    @OneToOne(cascade = CascadeType.ALL,orphanRemoval = true)
    private EmployeeDetails employeeDetails;
}
