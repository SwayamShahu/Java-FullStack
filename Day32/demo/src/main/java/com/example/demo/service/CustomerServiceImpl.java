package com.example.demo.service;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerServices{
    private final CustomerRepository repository;

    public CustomerServiceImpl(CustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public Customer addCustomer(Customer customer) {
        return repository.addCustomer(customer);
    }

    @Override
    public Customer updateCustomer(long id, Customer customer) {
        return repository.updateCustomer(id, customer);
    }

    @Override
    public List<Customer> getAllCustomer() {
        return repository.getAllCustomer();
    }

    @Override
    public Customer getCustomerBYId(long id) {
        return repository.getCustomerBYId(id);
    }
}
