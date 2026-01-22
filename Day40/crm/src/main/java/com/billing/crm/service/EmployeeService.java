package com.billing.crm.service;

import com.billing.crm.DTO.EmployeeCreateDTO;
import com.billing.crm.model.Employee;

import java.util.List;

public interface EmployeeService {
      public String addEmployee(EmployeeCreateDTO employeeCreateDTO);
      public String assignProject(int projectId, int employeeId, boolean isManger);
}
