package com.example.Spring.demo.controller;


import com.example.Spring.demo.dto.EmployeeDto;
import com.example.Spring.demo.entity.Employee;
import com.example.Spring.demo.repository.EmployeeRepository;
import com.example.Spring.demo.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {
    public final EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
        EmployeeDto employee= employeeService.createEmployee(employeeDto);
        return ResponseEntity.ok(employee);
    }
    @GetMapping
    public ResponseEntity<List<EmployeeDto>> getAllEmployee(){
        List<EmployeeDto> employees = employeeService.getAllEmployee();
        return ResponseEntity.ok(employees);
    }
}
