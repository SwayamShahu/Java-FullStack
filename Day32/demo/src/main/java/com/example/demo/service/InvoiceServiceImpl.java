package com.example.demo.service;

import com.example.demo.DTOs.InvoiceRequestDTO;
import com.example.demo.model.Customer;
import com.example.demo.model.Invoice;
import com.example.demo.model.InvoiceItem;
import com.example.demo.repository.InvoiceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//InvoiceRequestDTO - private Customer customer; private List<InvoiceItem> items; private int discount;
public class InvoiceServiceImpl implements InvoiceService{
    private final InvoiceRepository repository;

    public InvoiceServiceImpl(InvoiceRepository repository) {
        this.repository = repository;
    }

    @Override
    public Invoice createInvoice(InvoiceRequestDTO invoiceRequestDTO) {
        return repository.createInvoice(invoiceRequestDTO);
    }

    @Override
    public Invoice getInvoiceById(long invoiceId) {
        return repository.getInvoiceById(invoiceId);
    }

    @Override
    public List<Invoice> getAllInvoice() {
        return repository.getAllInvoice();
    }

    @Override
    public Invoice getInvoiceByCustomerId(long customerId) {
        return repository.getInvoiceByCustomerId(customerId);
    }


}
