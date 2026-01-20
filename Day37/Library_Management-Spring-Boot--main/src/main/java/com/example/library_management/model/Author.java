package com.example.library_management.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    private String email;
    private String country;
@JsonIgnore
    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private java.util.List<Book> books;

    public java.util.List<Book> getBooks() {
        return books;
    }

    public void setBooks(java.util.List<Book> books) {
        this.books = books;
    }

    public Author() {
    }

    public Author(int id, String name, int age, String email, String country) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
