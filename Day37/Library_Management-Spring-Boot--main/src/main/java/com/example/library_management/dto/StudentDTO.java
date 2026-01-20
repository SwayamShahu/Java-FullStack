package com.example.library_management.dto;

import com.example.library_management.enums.Department;

public class StudentDTO {
private String name;
private int age;
private String mobNo;
private Department department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public StudentDTO() {
    }

    public StudentDTO(String name, int age, String mobNo, Department department) {
        this.name = name;
        this.age = age;
        this.mobNo = mobNo;
        this.department = department;
    }
}
