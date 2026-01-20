package com.example.library_management.service;

import com.example.library_management.model.Transaction;

import java.util.List;

public interface TransactionService {
    public String issueBook(int cardId, int bookId);
    public String returnBook(int cardId, int bookId);
    public List<Transaction> getAllTransaction();
}
