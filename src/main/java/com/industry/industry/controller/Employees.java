package com.industry.industry.controller;

import com.industry.industry.dao.IndustryDao;
import com.industry.industry.entities.Industry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("employee")
public class Employees {

    @Autowired
    IndustryDao industryDao;

    @GetMapping("/get")
    public List<Industry>getAllEmployees() {
        List<Industry> employee=industryDao.findAll();
        return employee;
    }

}
