package com.example.library_management.service.Implementation;

import com.example.library_management.dto.BookDTO;
import com.example.library_management.model.Author;
import com.example.library_management.model.Book;
import com.example.library_management.repository.AuthorRepository;
import com.example.library_management.repository.BookRepository;
import com.example.library_management.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    AuthorRepository authorRepository;

    @Override
    public String addBook(BookDTO bookDTO) {
        Book book = new Book();
        book.setName(bookDTO.getName());
        book.setPages(bookDTO.getPages());

        Author author = authorRepository.findById(bookDTO.getAuthorId()).orElse(null);
        if (author == null) {
            throw new RuntimeException("Author not found");
        }
        book.setAuthor(author);

        bookRepository.save(book);
        return "Book added Successfully";
    }

    @Override
    public Book findBook(int id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }
}
