package com.master.EmployeeDatabase.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.master.EmployeeDatabase.entity.Department;
import com.master.EmployeeDatabase.entity.Employee;
import lombok.*;

import javax.persistence.Column;


@Setter
@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class EmployeeDTO {

    private long id;

    private String name;

    private String email;

    private String address;

    private String contactNumber;

    private String panNumber;

    private String aadharNumber;

    private String skills;

    private String certification;

    private String otherInformation;

    private Employee employee;

    private long dept_id;
    private String deptName;
    private String family;
    private String stream;


    public EmployeeDTO(String name, String email, String skills, String deptName, String family, String stream) {
        this.name = name;
        this.email = email;
        this.skills = skills;
        this.deptName = deptName;
        this.family = family;
        this.stream = stream;
    }
}
