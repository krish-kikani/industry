package com.industry.industry.manager;

import com.industry.industry.dto.EmployeeDTO;
import com.industry.industry.entities.Employee;
import com.industry.industry.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Service
@Slf4j
public class EmployeeManager {

    private static EmployeeService employeeService;

    public static Employee createEmployee(EmployeeDTO employeeDTO) {
        if (employeeDTO.getName() == null || employeeDTO.getName().isEmpty()){
            throw new IllegalArgumentException("Employee name cannot be empty");
        }
            return employeeService.saveEmployee(employeeDTO);
    }
}
