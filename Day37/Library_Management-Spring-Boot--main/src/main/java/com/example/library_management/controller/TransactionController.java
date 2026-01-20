package com.example.library_management.controller;

import com.example.library_management.model.Transaction;
import com.example.library_management.service.Implementation.TransactionServiceImpl;
import com.example.library_management.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
    @Autowired
    TransactionServiceImpl service;

    @PostMapping("/issue")
    public ResponseEntity<String> issuebook(@RequestParam int cardId, @RequestParam int bookId){
        try {
            return new ResponseEntity<>(service.issueBook(cardId, bookId), HttpStatus.OK);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @PostMapping("/return")
    public ResponseEntity<String> returnBook(@RequestParam int cardId, @RequestParam int bookId){
        try {
            return new ResponseEntity<>(service.returnBook(cardId, bookId), HttpStatus.OK);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping
    public  ResponseEntity<List<Transaction>> getAllTransaction(){
        try {
            return new ResponseEntity<>(service.getAllTransaction(), HttpStatus.OK);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
}
