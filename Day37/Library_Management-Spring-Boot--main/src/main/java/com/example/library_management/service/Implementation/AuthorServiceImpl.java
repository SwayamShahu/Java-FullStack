package com.example.library_management.service.Implementation;

import com.example.library_management.dto.AuthorDTO;
import com.example.library_management.model.Author;
import com.example.library_management.repository.AuthorRepository;
import com.example.library_management.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    @Override
    public String addAuthor(AuthorDTO authorDTO) {
        Author author = new Author();
        author.setName(authorDTO.getName());
        author.setAge(authorDTO.getAge());
        author.setEmail(authorDTO.getEmail());
        author.setCountry(authorDTO.getCountry());

        authorRepository.save(author);
        return "Author added Successfully";
    }

    @Override
    public Author findAuthor(int id) {
        return authorRepository.findById(id).orElse(null);
    }

    @Override
    public List<Author> findAll() {
        return authorRepository.findAll();
    }
    public String deleteAuthor(int id){
        authorRepository.deleteById(id);
        return "Author deleted";
    }
}
