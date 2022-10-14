package com.master.EmployeeDatabase.controller;

import com.master.EmployeeDatabase.DTO.EmployeeDTO;
import com.master.EmployeeDatabase.Service.EmployeeService;
import com.master.EmployeeDatabase.entity.Employee;
import com.master.EmployeeDatabase.repository.DepartmentRepository;
import com.master.EmployeeDatabase.repository.EmployeeRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private SessionFactory sessionFactory;


    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/all")
    public List<Employee> getAllEmployees(){
        return employeeService.getEmployees();
    }

    @PostMapping("/save")
    public Employee saveEmployee (@RequestBody Employee employee)
    {
        long rows=(long)sessionFactory.openSession().save(employee);
        Employee emp= sessionFactory.openSession().get(Employee.class,rows);
        return emp;
    }
//    @PostMapping("/saveList")
//    public List<Employee> saveAllEmployee (@RequestBody List<EmployeeDTO> employee)
//    {
//        return employeeService.saveAllEmployee(employee);
//    }

    @PutMapping ("/update/{id}")
    public Employee updateEmployee (@RequestBody Employee employee,@PathVariable("id") Long id)
    {
        return employeeService.updateEmployee(employee,id);
    }

    @PutMapping ("/delete/{id}")
    public void updateEmployee (@PathVariable("id") Long id)
    {
         employeeService.deleteEmployee(id);
    }

    @PostMapping("/saveDetails")
    public Employee saveDetails (@RequestBody EmployeeDTO employee)
    {
        return employeeRepository.save(employee.getEmployee());
    }

    @GetMapping ("/getDetails")
    public List<Employee> getDetails ()
    {
        return employeeRepository.findAll();
    }

    @GetMapping ("/getJoinDetails")
    public List<EmployeeDTO> getJoinInfo()
    {
        return employeeRepository.getJoinInfo();
    }

}
