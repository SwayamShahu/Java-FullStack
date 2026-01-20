package com.billing.crm.service;

import com.billing.crm.model.Department;

import java.util.List;

public interface DepartmentService {
    public String createDepartment(Department department);
    public List<Department> findAllDepartment();
    public String updateDepartment(int id, String name, String description);
    public String deleteDepartment(int id);
}
