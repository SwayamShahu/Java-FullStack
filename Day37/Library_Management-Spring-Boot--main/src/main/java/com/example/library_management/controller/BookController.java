package com.example.library_management.controller;

import com.example.library_management.dto.BookDTO;
import com.example.library_management.model.Book;
import com.example.library_management.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/addBook")
    public String addBook(@RequestBody BookDTO bookDTO) {
        return bookService.addBook(bookDTO);
    }

    @GetMapping("/find/{id}")
    public Book findBook(@PathVariable int id) {
        return bookService.findBook(id);
    }

    @GetMapping("/findAll")
    public List<Book> findAll() {
        return bookService.findAll();
    }
}
