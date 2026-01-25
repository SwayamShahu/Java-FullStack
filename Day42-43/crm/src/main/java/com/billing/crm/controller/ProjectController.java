package com.billing.crm.controller;

import com.billing.crm.DTO.ProjectCreateDTO;
import com.billing.crm.model.Project;
import com.billing.crm.service.implementation.ProjectServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ProjectController {
    @Autowired
    ProjectServiceImplement projectService;

    @PostMapping("/manger/Projects")
    ResponseEntity<Project> addProject(@RequestBody ProjectCreateDTO projectCreateDTO){
        try{
            return new ResponseEntity<>(projectService.createProject(projectCreateDTO), HttpStatus.OK);
        }catch (Exception e){
            System.out.println(e);
            return ResponseEntity.badRequest().build();
        }
    }

    @PreAuthorize("hasAnyRole('EMPLOYEE', 'ADMIN')")
    @GetMapping("/manger/projects")
    ResponseEntity<List<Project>> findAll(){
        try{
            return new ResponseEntity<>(projectService.getAllProjects(), HttpStatus.OK);
        }catch (Exception e){
            System.out.println(e);
            return ResponseEntity.badRequest().build();
        }
    }

    @PreAuthorize("hasRole('EMPLOYEE')")
    @PostMapping("/manager/project/{id}/assign")
    ResponseEntity<String> assignManager(@PathVariable int projectId, @RequestParam int managerId){
        try{
            return new ResponseEntity<>(projectService.assignManger(projectId, managerId), HttpStatus.OK);
        }catch (Exception e){
            System.out.println(e);
            return ResponseEntity.badRequest().build();
        }
    }
}
