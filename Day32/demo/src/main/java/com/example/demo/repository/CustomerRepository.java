package com.example.demo.repository;

import com.example.demo.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
// Add customer, Update customer details, Get all customers, Get customer by ID
public class CustomerRepository {
    private final ArrayList<Customer> list = new ArrayList<>();

    public Customer addCustomer(Customer customer){
        list.add(customer);
        return customer;
    }

    public Customer updateCustomer(long customerId, Customer customer){
        Customer temp = new Customer();
        for(int i = 0; i < list.size(); i++){
            if (list.get(i).getId() == customerId) {
                list.get(i).setName(customer.getName());
                list.get(i).setPhone(customer.getPhone());
                list.get(i).setEmail(customer.getEmail());
                list.get(i).setAddress(customer.getAddress());
                temp = list.get(i);
            }
        }
        return temp;
    }

    public List<Customer> getAllCustomer(){
        return list;
    }

    public Customer getCustomerBYId(long id){
        return list.stream().filter(customer -> customer.getId() == id).findFirst().orElse(null);
    }

}
