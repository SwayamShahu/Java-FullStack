package com.billing.crm.service.implementation;

import com.billing.crm.DTO.DepartmentRequestDTO;
import com.billing.crm.model.Department;
import com.billing.crm.repository.DepartmentRepository;
import com.billing.crm.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentRepository repository;
    @Override
    public String createDepartment(DepartmentRequestDTO department) {
        Department d = new Department();
        d.setName(department.getName());
        d.setDescription(department.getDescription());
        repository.save(d);
        return "Department added Successfully";
    }

    @Override
    public List<Department> findAllDepartment() {
        return repository.findAll();
    }

    @Override
    public String updateDepartment(int id, String name, String description) {
        Department department = repository.findById(id).orElse(null);
        if (department != null){
            department.setDescription(description);
            department.setName(name);
            repository.save(department);
            return "Department is been updated";
        }
        return "Fail to update";
    }

    @Override
    public String deleteDepartment(int id) {
        Department department = repository.findById(id).orElse(null);
        if (department != null){
            repository.deleteById(id);
            return "Department is been deleted";
        }
        return "Fail to delete";
    }
    
}
