package com.example.demo.controller;

import com.example.demo.DTOs.InvoiceRequestDTO;
import com.example.demo.model.Invoice;
import com.example.demo.service.InvoiceServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {
    private final InvoiceServiceImpl service;
    public InvoiceController(InvoiceServiceImpl service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Invoice> generateInvoice(@RequestBody InvoiceRequestDTO invoiceData){
        try{
            return new ResponseEntity<>(service.createInvoice(invoiceData), HttpStatus.OK);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Invoice>> getAllInvoice(){
        try{
            return new ResponseEntity<>(service.getAllInvoice(), HttpStatus.OK);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Invoice> getInvoiceById(@PathVariable long id){
        try{
            return new ResponseEntity<>(service.getInvoiceById(id), HttpStatus.OK);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/customer/{customerId}")
    public ResponseEntity<Invoice> getInvoiceByCustomerId(@PathVariable long customerId){
        try{
            return new ResponseEntity<>(service.getInvoiceByCustomerId(customerId), HttpStatus.OK);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
}
