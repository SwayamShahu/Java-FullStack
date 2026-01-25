package com.billing.crm.service.implementation;

import com.billing.crm.DTO.ProjectCreateDTO;
import com.billing.crm.model.Employee;
import com.billing.crm.model.Project;
import com.billing.crm.repository.ProjectRepository;
import com.billing.crm.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImplement implements ProjectService {
    @Autowired
    ProjectRepository projectRepository;
    @Autowired
    EmployeeServiceImpl employeeService;
    @Override
    public Project createProject(ProjectCreateDTO projectCreateDTO) {
        if (projectRepository.existsByName(projectCreateDTO.getName())){
            throw new RuntimeException("Project name must not be duplicate");
        }
        Project project = new Project();
        project.setName(projectCreateDTO.getName());
        project.setDescription(projectCreateDTO.getDescription());
        project.setStatus(projectCreateDTO.getStatus());
        project.setStartDate(projectCreateDTO.getStartDate());
        project.setEndDate(projectCreateDTO.getEndDate());
        return projectRepository.save(project);
    }

    @Override
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    @Override
    public String assignManger(int id, int managerId) {
        Employee employee = employeeService.getEmployee(managerId);
        Project project = projectRepository.findById(id).orElse(null);
        if (employee == null || project == null){
            throw new RuntimeException("Something went wrong, manager or project not found");
        }
        project.setManager(employee);
        projectRepository.save(project);
        return "Successfully assign";
    }
}
