package com.example.demo.service;

import com.example.demo.exception.ProductNotFound;
import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    public Product createProduct(Product product){
        try {
            repository.save(product);
        }catch (Exception e){
            System.out.println(e);
            throw e;
        }
        return product;
    }

    public Product findById(int id){
        try {
            return repository.findById(id);
        }catch (Exception e){
            throw e;
        }
    }

    public Product deleteById(int id){
        try {
            return repository.deleteById(id);

        }catch (Exception e){
            throw e;
        }
    }

    public Product updateProduct(int id, Product product){
        try {
            return repository.updateById(id, product);
        }catch (ProductNotFound e){
            throw e;
        }
    }

    public List<Product> searchByName(String name){
        try{
            return repository.searchByName(name);
        }catch (Exception e){
            throw e;
        }
    }

    public List<Product> filterProduct(int min, int max){
        try {
            return repository.filterProduct(min, max);
        } catch (Exception e) {
            throw e;
        }
    }
}
