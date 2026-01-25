package com.billing.crm.controller;

import com.billing.crm.DTO.EmployeeCreateDTO;
import com.billing.crm.model.Employee;
import com.billing.crm.service.EmployeeService;
import com.billing.crm.service.implementation.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class EmployeeController {
    @Autowired
    private EmployeeServiceImpl service;

    @PostMapping("/admin/employee")
    public ResponseEntity<String> createEmployee(@RequestBody EmployeeCreateDTO employeeCreateDTO){
        try {
            return new ResponseEntity<>(service.addEmployee(employeeCreateDTO), HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e);
            return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping("/assign/{projectId}/{employeeId}")
    public ResponseEntity<String> assignProject(@PathVariable int projectId, @PathVariable int employeeId, @RequestParam boolean isManger){
        try {
            return new ResponseEntity<>(service.assignProject(projectId, employeeId, isManger), HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e);
            return new ResponseEntity<>("Fail to assign", HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/getEmployee")
    public ResponseEntity<List<Employee>> getAll(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
}




