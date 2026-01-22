package com.billing.crm.DTO;
import com.billing.crm.Enums.EmployeeStatus;
import com.billing.crm.Enums.Role;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class EmployeeCreateDTO {
    private String name;
    private String email;
    private String phone;
    private String designation;
    private EmployeeStatus status;
    private LocalDate joiningDate;
    private double salary;
    private String username;
    private String password;
    private Role role;
}
