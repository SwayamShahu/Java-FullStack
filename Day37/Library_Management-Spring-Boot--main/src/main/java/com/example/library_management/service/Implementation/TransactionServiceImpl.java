package com.example.library_management.service.Implementation;

import com.example.library_management.enums.TransactionStatus;
import com.example.library_management.model.Book;
import com.example.library_management.model.Card;
import com.example.library_management.model.Transaction;
import com.example.library_management.repository.TransactionRepository;
import com.example.library_management.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Date;
import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    CardServiceImpl cardService;
    @Autowired
    BookServiceImpl bookService;
    @Autowired
    TransactionRepository transactionRepository;
    @Override
    public String issueBook(int cardId, int bookId) {
        Transaction transaction = new Transaction();
        Card card = cardService.getCard(cardId);
        Book book = bookService.findBook(bookId);
        if (card != null || book != null){
            transaction.setBook(book);
            transaction.setCard(card);
            transaction.setTransactionStatus(TransactionStatus.ISSUED);
            transactionRepository.save(transaction);
            return "Book Issued Succesfully";
        }
        return "Fail to issued";
    }

    @Override
    public String returnBook(int cardId, int bookId) {
        Transaction transaction = transactionRepository.findByBookIdAndCard_cardId(bookId, cardId).orElse(null);
        if (transaction != null){
            transaction.setTransactionStatus(TransactionStatus.SUBMITTED);
            transactionRepository.save(transaction);

            Date issueDate = transaction.getIssueDate();
            LocalDate issueLocalDate = issueDate.toInstant()
                    .atZone(ZoneId.systemDefault())
                    .toLocalDate();
            LocalDate now = LocalDate.now();
            long days = ChronoUnit.DAYS.between(issueLocalDate, now);

            return "Book returned";
        }
        return "Fail to return";
    }

    @Override
    public List<Transaction> getAllTransaction() {
        return transactionRepository.findAll();
    }
}
