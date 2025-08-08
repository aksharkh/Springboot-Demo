package com.example.Spring.demo.repository;

import com.example.Spring.demo.entity.EmployeeCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeCompanyRepository extends JpaRepository<EmployeeCompany, Long> {
}
