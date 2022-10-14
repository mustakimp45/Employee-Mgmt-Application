package com.master.EmployeeDatabase.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "emp_mgmt")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "emp_name")
    private String name;

    @Column(name = "emp_email",unique = true)
    private String email;

    @Column(name = "emp_address")
    private  String address;

    @Column(name = "emp_contact_number",unique = true)
    private String contactNumber;

    @Column(name = "emp_pan_number",unique = true)
    private  String panNumber;

    @Column(name = "emp_aadhar_number",unique = true)
    private String aadharNumber;

    @Column(name = "emp_skills")
    private String skills;

    @Column(name = "emp_certification")
    private String certification;

    @Column(name = "emp_other_information")
    private String otherInformation;

    @OneToMany(targetEntity = Department.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "emp_id_fk",referencedColumnName = "id")
    private List<Department> department;

}
