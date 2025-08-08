package com.example.Spring.demo.dto;


import lombok.Data;

@Data
public class EmployeeDto {
    private Long id;
    private String name;
    private String department;
    private Double salary;
    private EmployeeDetailsDto employeeDetails;
}
