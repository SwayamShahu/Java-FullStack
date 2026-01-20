package com.example.library_management.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int pages;
    private float rentPrice;
    @OneToMany(mappedBy = "book")
    private List<Transaction> IssuedBook=new ArrayList<>();

    public float getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(float rentPrice) {
        this.rentPrice = rentPrice;
    }

    @ManyToOne
    @JoinColumn
    private Author author;

    public Book() {
    }

    public Book(int id, String name, int pages, Author author,float rentPrice) {
        this.id = id;
        this.name = name;
        this.pages = pages;
        this.author = author;
        this.rentPrice=rentPrice;
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

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
