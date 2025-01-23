package com.industry.industry.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="employee")
public class Industry {

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Id
    @Column(name="id")
    private int id;

    @Column(name="employee_id")
    private int employeeId;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "position")
    private String position;

    @Column(name = "department")
    private String department;

    @Column(name = "salary")
    private long salary;

    @Column(name = "manager_id")
    private int managerId;

    @Column(name = "past-experience")
    private long pastExperience;

    @Column(name = "past_company")
    private String pastCompany;

}
