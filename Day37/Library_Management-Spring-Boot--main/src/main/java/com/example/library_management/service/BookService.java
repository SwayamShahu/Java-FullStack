package com.example.library_management.service;

import com.example.library_management.dto.BookDTO;
import com.example.library_management.model.Book;

import java.util.List;

public interface BookService {
    String addBook(BookDTO bookDTO);

    Book findBook(int id);

    List<Book> findAll();
}
