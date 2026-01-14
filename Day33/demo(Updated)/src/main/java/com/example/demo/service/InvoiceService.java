package com.example.demo.service;

import com.example.demo.DTOs.InvoiceRequestDTO;
import com.example.demo.model.Invoice;

import java.util.List;

public interface InvoiceService {

    Invoice createInvoice(InvoiceRequestDTO dto);

    Invoice getInvoiceById(long invoiceId);

    List<Invoice> getAllInvoice();

    Invoice getInvoiceByCustomerId(long customerId);
}
