package com.quizapp.librarymanagement.dto;

import com.quizapp.librarymanagement.Enums.Department;

public class StudentRequestdto {

    private String name;
    private int age;
    private Department department;
    private String mobNo;

    public StudentRequestdto() {
    }

    // Optional constructor
    public StudentRequestdto(String name, int age, Department department, String mobNo) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.mobNo = mobNo;
    }

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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }
}
