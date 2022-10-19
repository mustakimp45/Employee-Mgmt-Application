package com.master.EmployeeDatabase.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="dept_mgmt")
public class Department {

    @Id
    private long dept_id;
    private String deptName;
    private String family;
    private String stream;



}
