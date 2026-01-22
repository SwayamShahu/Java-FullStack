package com.billing.crm.service.implementation;

import com.billing.crm.DTO.EmployeeCreateDTO;
import com.billing.crm.model.Employee;
import com.billing.crm.model.Project;
import com.billing.crm.model.User;
import com.billing.crm.repository.EmployeeRepository;
import com.billing.crm.repository.ProjectRepository;
import com.billing.crm.repository.UserRepository;
import com.billing.crm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    ProjectRepository projectRepository;
    @Override
    public String addEmployee(EmployeeCreateDTO employeeCreateDTO) {
        if(employeeRepository.existsByEmail(employeeCreateDTO.getEmail())){
            return "Fail to add, employee already exist with this email";
        }
        User user = new User();
        user.setUsername(employeeCreateDTO.getUsername());
        user.setPassword(passwordEncoder.encode(employeeCreateDTO.getPassword()));
        user.setRole(employeeCreateDTO.getRole());
        userRepository.save(user);
        Employee employee = new Employee();
        employee.setName(employeeCreateDTO.getName());
        employee.setEmail(employeeCreateDTO.getEmail());
        employee.setPhone(employeeCreateDTO.getPhone());
        employee.setStatus(employeeCreateDTO.getStatus());
        employee.setDesignation(employeeCreateDTO.getDesignation());
        employee.setSalary(employeeCreateDTO.getSalary());
        employee.setJoiningDate(employeeCreateDTO.getJoiningDate());
        employee.setUser(user);
        employeeRepository.save(employee);
        return "Employee created Successfully";
    }

    @Override
    public String assignProject(int projectId, int employeeId, boolean isManger) {
        Project project = projectRepository.findById(projectId).orElse(null);
        Employee employee = employeeRepository.findById(employeeId).orElse(null);
        if (project == null || employee == null){
            return "Fail to assign";
        }
//        project.getEmployees().add(employee);
        if (isManger){
            project.setManager(employee);
        }
        employee.getProjects().add(project);
//        projectRepository.save(project);
        employeeRepository.save(employee);
        return "Assigned successfully";
    }

    public Employee getEmployee(int id){
        return employeeRepository.findById(id).orElse(null);
    }
}
