package com.industry.industry.dao;

import com.industry.industry.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {
}