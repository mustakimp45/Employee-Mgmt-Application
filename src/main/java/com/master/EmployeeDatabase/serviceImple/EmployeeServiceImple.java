package com.master.EmployeeDatabase.serviceImple;

import com.master.EmployeeDatabase.DTO.EmployeeDTO;
import com.master.EmployeeDatabase.Service.EmployeeService;
import com.master.EmployeeDatabase.entity.Department;
import com.master.EmployeeDatabase.entity.Employee;
import com.master.EmployeeDatabase.repository.DepartmentRepository;
import com.master.EmployeeDatabase.repository.EmployeeRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImple implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee updateEmployee(Employee employee, Long id) {

        Employee emp=employeeRepository.findById(id).get();
        if(employee.getName()!=null){
            emp.setName(employee.getName());
        }
        if(employee.getContactNumber()!=null){
            emp.setContactNumber(employee.getContactNumber());
        }
        if(employee.getSkills()!=null){
            emp.setSkills(employee.getSkills());
        }
        return employeeRepository.save(emp);
    }

    @Override
    public void deleteEmployee(Long id) {

         employeeRepository.deleteById(id);
    }

    @Override
    public Employee saveEmployee1(Employee employee) {

        int rows=(int)sessionFactory.getCurrentSession().save(employee);
        Employee emp= sessionFactory.getCurrentSession().get(Employee.class,rows);
        return emp;
    }








}
