package com.example.Spring.demo.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class EmployeeDto {
    private Long id;
    @NotBlank(message = "name should not be empty")
    private String name;
    @NotBlank(message = "department should not blank")
    private String department;
    @NotNull(message = "enter salary")
    @Positive(message = "enter valid salary")
    private Double salary;
    private EmployeeDetailsDto employeeDetails;
}
