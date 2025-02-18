package com.industry.industry.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.industry.industry.entities.Employee;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeDTO {

    private int id;
    private int employeeId;
    private String name;
    private String surname;
    private String position;
    private String department;
    private Long salary;
    private int managerId;
    private long pastExperience;
    private String pastCompany;


     /*public static EmployeeDTO from(Employee employee ) {
       return EmployeeDTO.builder().id(employee.getEmployeeId())

         .employeeId(employee.getEmployeeId())
         .name(employee.getName())
         .surname(employee.getSurname())
         .position(employee.getPosition())
         .department(employee.getDepartment())
         .salary(employee.getSalary())
         .managerId(employee.getManagerId())
         .pastExperience(employee.getPastExperience())
         .pastCompany(employee.getPastCompany())
         .build();
     }
*/

}

