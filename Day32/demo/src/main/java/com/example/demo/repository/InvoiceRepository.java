package com.example.demo.repository;

import com.example.demo.DTOs.InvoiceRequestDTO;
import com.example.demo.model.Customer;
import com.example.demo.model.Invoice;
import com.example.demo.model.InvoiceItem;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InvoiceRepository {
//    InvoiceRequestDTO -> Customer customer, List<InvoiceItem> items, int discount;
    private final List<Invoice> list = new ArrayList<>();
    private final List<InvoiceItem> itemList = new ArrayList<>();

    public Invoice createInvoice(InvoiceRequestDTO invoiceRequestDTO) {
        double totalAmount = 0, taxAmount = 0, discout = 0;
        for (InvoiceItem item: invoiceRequestDTO.getItems()){
            totalAmount = totalAmount + item.getQuantity() * item.getPrice();
            taxAmount = taxAmount + item.getTaxAmount();
            discout = discout + item.getDiscount();
            itemList.add(item);
        }
        Invoice invoice = new Invoice();
        invoice.setCustomer(invoiceRequestDTO.getCustomer());
        invoice.setDiscout(discout);
        invoice.setTotalAmount(totalAmount);
        invoice.setTotalTax(taxAmount);
        invoice.setFinalAmount(totalAmount + taxAmount - discout);
        list.add(invoice);
        return invoice;
    }

    public Invoice getInvoiceById(long orderId) {
        for (Invoice invoice : list) {
            if (orderId == invoice.getInvoiceId()) {
                return invoice;
            }
        }
        return null;
    }

    public List<Invoice> getAllInvoice() {
        return list;
    }

    public Invoice getInvoiceByCustomerId(long customerId){
        for (Invoice invoice: list){
            if (invoice.getCustomer().getId() == customerId){
                return invoice;
            }
        }
        return null;
    }
}
