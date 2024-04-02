package com.springboot.Spring.Boot.Project.repository;

import com.springboot.Spring.Boot.Project.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Department findBydepartmentName(String departmentName);
}
