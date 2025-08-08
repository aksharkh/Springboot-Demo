package com.example.Spring.demo.dto;


import lombok.Data;

@Data
public class EmployeeDetailsDto {
    private Long employeeDetailsId;
    private String role;
    private String work;
    private EmployeeCompanyDto Company;
}
