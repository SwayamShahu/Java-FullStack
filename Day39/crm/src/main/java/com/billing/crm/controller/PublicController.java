package com.billing.crm.controller;

import com.billing.crm.model.User;
import com.billing.crm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/public")
public class PublicController {
    @Autowired
    UserService service;

    @PostMapping("/register")
    ResponseEntity<User> addUser(@RequestBody User user){
        try {
            return new ResponseEntity<>(service.addUser(user), HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e);
            return ResponseEntity.badRequest().build();
        }
    }
}
