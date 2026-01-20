package com.billing.crm.DTO;

import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

public class DepartmentResponseDTO {
    public int id;
    public String name;
    public String Department;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
