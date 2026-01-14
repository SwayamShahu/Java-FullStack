package com.example.demo.DTOs;

import com.example.demo.model.Customer;
import com.example.demo.model.InvoiceItem;

import java.time.LocalDate;
import java.util.List;

public class InvoiceRequestDTO {
    private Customer customer;
    private List<InvoiceItem> items;
    private int discount;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public List<InvoiceItem> getItems() {
        return items;
    }

    public void setItems(List<InvoiceItem> items) {
        this.items = items;
    }
}
