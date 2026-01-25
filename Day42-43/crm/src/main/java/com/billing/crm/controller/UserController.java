package com.billing.crm.controller;

import com.billing.crm.model.User;
import com.billing.crm.service.implementation.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("user")
    public String home() {
        return "User logged in";
    }

    @GetMapping("admin")
    public String login() {
        return "User logged in";
    }

    @PostMapping("user/register")
    public User register(@RequestBody User user) {
        return userService.register(user);
    }
}
