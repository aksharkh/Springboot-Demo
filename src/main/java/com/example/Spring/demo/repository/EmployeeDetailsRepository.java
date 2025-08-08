package com.example.Spring.demo.repository;

import com.example.Spring.demo.entity.EmployeeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDetailsRepository extends JpaRepository <EmployeeDetails,Long> {
}
