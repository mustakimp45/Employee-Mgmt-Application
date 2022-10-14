package com.master.EmployeeDatabase.repository;

import com.master.EmployeeDatabase.DTO.EmployeeDTO;
import com.master.EmployeeDatabase.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {


}
