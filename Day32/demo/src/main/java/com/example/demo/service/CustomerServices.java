package com.example.demo.service;

import com.example.demo.model.Customer;

import java.util.List;

public interface CustomerServices {
//    Add customer, Update customer details, Get all customers, Get customer by ID
    public Customer addCustomer(Customer customer);
    public Customer updateCustomer(long id, Customer customer);
    public List<Customer> getAllCustomer();
    public Customer getCustomerBYId(long id);
}
