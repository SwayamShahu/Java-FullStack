package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerServices services;

    public CustomerController(CustomerServices services) {
        this.services = services;
    }

    // Add customer
    @PostMapping
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
        Customer savedCustomer = services.addCustomer(customer);
        return new ResponseEntity<>(savedCustomer, HttpStatus.CREATED);
    }

    // Update customer
    @PutMapping("/{id}")
    public ResponseEntity<String> updateCustomer(
            @PathVariable long id,
            @RequestBody Customer customer) {

        int updated = services.updateCustomer(id, customer);

        if (updated == 0) {
            return new ResponseEntity<>("Customer not found", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>("Customer updated successfully", HttpStatus.OK);
    }

    // Get all customers
    @GetMapping
    public ResponseEntity<List<Customer>> getAllCustomer() {
        return new ResponseEntity<>(services.getAllCustomer(), HttpStatus.OK);
    }

    // Get customer by ID
    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable long id) {
        Customer customer = services.getCustomerById(id);

        if (customer == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }
}
