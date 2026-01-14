package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpRequest;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    //Add customer, Update customer details, Get all customers, Get customer by ID
    private final CustomerServices services;

    public CustomerController(CustomerServices services) {
        this.services = services;
    }

    @PostMapping
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
        try {
            return new ResponseEntity<>(services.addCustomer(new Customer(customer.getAddress(), customer.getEmail(), customer.getPhone(),customer.getName() )), HttpStatus.OK);
        }catch (Exception e){
            return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable long id, @RequestBody Customer customer){
        try {
            return new ResponseEntity<>(services.updateCustomer(id, customer), HttpStatus.OK);
        }catch (Exception e){
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Customer>> getAllCustomer(){
        try {
            return new ResponseEntity<>(services.getAllCustomer(), HttpStatus.OK);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable long id){
        try {
            return new ResponseEntity<>(services.getCustomerBYId(id), HttpStatus.OK);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
}
