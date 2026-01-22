package com.billing.crm.service;

import com.billing.crm.DTO.ProjectCreateDTO;
import com.billing.crm.model.Project;

import java.util.List;

public interface ProjectService {
    public Project createProject(ProjectCreateDTO projectCreateDTO);
    public List<Project> getAllProjects();
    public String assignManger(int id, int managerId);

}
