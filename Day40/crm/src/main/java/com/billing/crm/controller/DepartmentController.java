package com.billing.crm.controller;

import com.billing.crm.model.Department;
import com.billing.crm.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping
public class DepartmentController {
    @Autowired
    DepartmentService service;

    @PostMapping("/admin/departments")
    public String addDepartment(@RequestBody Department department){
        return service.createDepartment(department);
    }

    @GetMapping("/hr/departments")
    public List<Department> getAllDepartment(){
        return service.findAllDepartment();
    }

    @PutMapping("/admin/departments/{id}")
    public String updateDepartment(@PathVariable int id, @RequestParam String description,@RequestParam String name){
        return service.updateDepartment(id, name, description);
    }

    @DeleteMapping("/admin/departments/{id}")
    public String deleteDepartment(@PathVariable int id){
        return service.deleteDepartment(id);
    }
}
