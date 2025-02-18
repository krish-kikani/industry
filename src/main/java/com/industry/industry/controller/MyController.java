package com.industry.industry.controller;

import com.industry.industry.dao.EmployeeDao;
import com.industry.industry.dto.EmployeeDTO;
import com.industry.industry.entities.Employee;
import com.industry.industry.manager.EmployeeManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/employee")
public class MyController {

    @Autowired
    private EmployeeManager employeeManager;

    public MyController(EmployeeManager manager) {
        this.employeeManager = manager;
    }

    @Autowired
    EmployeeDao repo;

    @GetMapping
    public List<Employee> getAllEmployees() {
        List<Employee> employee = repo.findAll();
        return employee;
    }
    @PostMapping("/add")
    public ResponseEntity<Employee> createEmployee(@RequestBody EmployeeDTO employeeDTO){
        Employee employee = EmployeeManager.createEmployee(employeeDTO);
        return new ResponseEntity<>(employee, HttpStatus.CREATED);
   }
}
