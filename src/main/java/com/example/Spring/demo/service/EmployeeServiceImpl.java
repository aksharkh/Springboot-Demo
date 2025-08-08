package com.example.Spring.demo.service;


import com.example.Spring.demo.dto.EmployeeDto;
import com.example.Spring.demo.entity.Employee;
import com.example.Spring.demo.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto){
        Employee employee = modelMapper.map(employeeDto, Employee.class);
        Employee created= employeeRepository.save(employee);
        return modelMapper.map(created, EmployeeDto.class);

    }

    @Override
    public List<EmployeeDto> getAllEmployee(){
        List<Employee> employees = employeeRepository.findAll();
        return  employees.stream().map(employee -> modelMapper.map(employee, EmployeeDto.class)).collect(Collectors.toList());

    }
}
