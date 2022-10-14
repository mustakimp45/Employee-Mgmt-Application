package com.master.EmployeeDatabase.repository;

import com.master.EmployeeDatabase.DTO.EmployeeDTO;
import com.master.EmployeeDatabase.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    @Query("Select new com.master.EmployeeDatabase.DTO.EmployeeDTO(e.name,e.email,e.skills,d.deptName,d.family,d.stream) FROM Employee e JOIN e.department d")
    public List<EmployeeDTO> getJoinInfo();
}
