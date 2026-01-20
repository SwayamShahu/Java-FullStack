package com.example.library_management.repository;

import com.example.library_management.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
    Optional<Transaction> findByBookIdAndCard_cardId(int bookId, int cardId);
}
