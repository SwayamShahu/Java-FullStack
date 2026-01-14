package com.example.demo.repository;

import com.example.demo.model.Customer;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerRepository {

    private final JdbcTemplate jdbcTemplate;

    public CustomerRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // RowMapper for Customer
    private final RowMapper<Customer> rowMapper = (rs, rowNum) -> {
        Customer customer = new Customer();
        customer.setId(rs.getLong("id"));
        customer.setName(rs.getString("name"));
        customer.setPhone(rs.getString("phone"));
        customer.setEmail(rs.getString("email"));
        customer.setAddress(rs.getString("address"));
        return customer;
    };

    // Add customer
    public Customer addCustomer(Customer customer) {
        jdbcTemplate.update(
                "INSERT INTO customer(name, phone, email, address) VALUES (?, ?, ?, ?)",
                customer.getName(),
                customer.getPhone(),
                customer.getEmail(),
                customer.getAddress()
        );
        return customer;
    }

    // Update customer
    public int updateCustomer(long customerId, Customer customer) {
        return jdbcTemplate.update(
                "UPDATE customer SET name = ?, phone = ?, email = ?, address = ? WHERE id = ?",
                customer.getName(),
                customer.getPhone(),
                customer.getEmail(),
                customer.getAddress(),
                customerId
        );
    }

    // Get all customers
    public List<Customer> getAllCustomer() {
        return jdbcTemplate.query("SELECT * FROM customer", rowMapper);
    }

    // Get customer by ID
    public Customer getCustomerById(long id) {
        List<Customer> customers = jdbcTemplate.query(
                "SELECT * FROM customer WHERE id = ?",
                rowMapper,
                id
        );
        return customers.isEmpty() ? null : customers.get(0);
    }
}
