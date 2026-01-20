package com.billing.crm.controller;

import com.billing.crm.model.User;
import com.billing.crm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    UserService service;
    @GetMapping("/getUsers")
    public String userSecurity(){
        return "User Logged in...";
    }
}
