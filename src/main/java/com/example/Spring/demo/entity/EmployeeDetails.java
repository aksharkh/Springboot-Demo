package com.example.Spring.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class EmployeeDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeDetailsId;
    private String role;
    private String work;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private EmployeeCompany company;
}
