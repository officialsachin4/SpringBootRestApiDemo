package com.springboot.Spring.Boot.Project.service;

import com.springboot.Spring.Boot.Project.Error.DeartmentNotFoundException;
import com.springboot.Spring.Boot.Project.entity.Department;

import java.util.List;

public interface DepartmentService {
   public Department saveDepartment(Department department);

   public List<Department> fetchDepartmentList();

   public Department fetchDepartmentById(Long departmentId) throws DeartmentNotFoundException;

   public void deleteDepartmentById(Long departmentId);

   public Department updateDepartment(Long departmentId, Department department);

  public Department fetchDepartmentbyName(String departmentName);
}
