package com.example.demo.service;

import com.example.demo.model.Customer;
import java.util.List;

public interface CustomerServices {

    Customer addCustomer(Customer customer);

    int updateCustomer(long id, Customer customer);

    List<Customer> getAllCustomer();

    Customer getCustomerById(long id);
}
