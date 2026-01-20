package com.example.library_management.service;

import com.example.library_management.dto.AuthorDTO;
import com.example.library_management.model.Author;

import java.util.List;

public interface AuthorService {
    String addAuthor(AuthorDTO authorDTO);

    Author findAuthor(int id);

    List<Author> findAll();
    String deleteAuthor(int id);
}
