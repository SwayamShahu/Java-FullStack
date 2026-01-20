package com.quizapp.librarymanagement.service.Implementation;

import com.quizapp.librarymanagement.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImplementation {
    @Autowired
    BookRepository bookRepository;


}
