package com.example.Spring.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class EmployeeDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeDetailsId;
    private String role;
    private String work;
    @OneToMany(cascade = CascadeType.ALL,targetEntity = EmployeeCompany.class)
    private List<EmployeeCompany> company;
}
