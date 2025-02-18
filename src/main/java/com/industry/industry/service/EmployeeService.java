package com.industry.industry.service;

import com.industry.industry.dao.EmployeeDao;
import com.industry.industry.dto.EmployeeDTO;
import com.industry.industry.entities.Employee;
import com.industry.industry.enums.EmployeeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

@Service
@Slf4j
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private LocalContainerEntityManagerFactoryBean entityManagerFactory2;

    public EmployeeService(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public Employee saveEmployee(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        employee.setEmployeeId(employeeDTO.getEmployeeId());
        employee.setName(employeeDTO.getName());
        employee.setSurname(employeeDTO.getSurname());
        employee.setPosition(EmployeeEnum.Position.CHIEF.name());
        employee.setDepartment(EmployeeEnum.Department.TECH.name());
        employee.setSalary(employeeDTO.getSalary());
        employee.setManagerId(employeeDTO.getManagerId());
        employee.setPastExperience(employeeDTO.getPastExperience());
        employee.setPastCompany(employeeDTO.getPastCompany());
        return employeeDao.save(employee);
    }


 /*       public Employee saveEmployee (int employeeId , String name , String surname , EmployeeEnum.Position position , EmployeeEnum.Department department , Long salary , int managerId , Long pastExperience , String pastCompany ) {
        Employee employee = new Employee();
        employee.setEmployeeId(employeeId);
        employee.setName(name);
        employee.setSurname(surname);
        employee.setPosition(EmployeeEnum.Position.CHIEF.name());
        employee.setDepartment(EmployeeEnum.Department.TECH.name());
        employee.setSalary(salary);
        employee.setManagerId(managerId);
        employee.setPastExperience(pastExperience);
        employee.setPastCompany(pastCompany);
        return employeeDao.save(employee);

}*/

}


