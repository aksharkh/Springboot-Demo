package com.example.Spring.demo.dto;


import lombok.Data;

import java.util.List;

@Data
public class EmployeeDetailsDto {

    private String role;
    private String work;
    private List<EmployeeCompanyDto> company;
}
