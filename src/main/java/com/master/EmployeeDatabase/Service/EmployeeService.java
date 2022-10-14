package com.master.EmployeeDatabase.Service;

import com.master.EmployeeDatabase.DTO.EmployeeDTO;
import com.master.EmployeeDatabase.entity.Department;
import com.master.EmployeeDatabase.entity.Employee;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


public interface EmployeeService {
    Employee saveEmployee(Employee employee);

    List<Employee> getEmployees();

    Employee updateEmployee(Employee employee,Long id);

    void deleteEmployee(Long id);


    Employee saveEmployee1(Employee employee);

//    List<Employee> saveAllEmployee(List<EmployeeDTO> employee);


}
