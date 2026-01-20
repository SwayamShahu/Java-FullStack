package com.example.library_management.controller;

import com.example.library_management.dto.AuthorDTO;
import com.example.library_management.model.Author;
import com.example.library_management.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @PostMapping("/addAuthor")
    public String addAuthor(@RequestBody AuthorDTO authorDTO) {
        return authorService.addAuthor(authorDTO);
    }

    @GetMapping("/find/{id}")
    public Author findAuthor(@PathVariable int id) {
        return authorService.findAuthor(id);
    }

    @GetMapping("/findAll")
    public List<Author> findAll() {
        return authorService.findAll();
    }
    @DeleteMapping("/{id}")
    public String deleteAuthor(@PathVariable int id){
        return authorService.deleteAuthor(id);
    }
}
