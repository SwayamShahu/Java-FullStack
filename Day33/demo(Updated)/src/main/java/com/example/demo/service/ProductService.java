package com.example.demo.service;

import com.example.demo.exception.ProductNotFound;
import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.stereotype.Service;

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
        repository.save(product);
        return product;
    }

    public Product findById(int id){
        return repository.findById(id);
    }

    public Product deleteById(int id){
        return repository.deleteById(id);
    }

    public Product updateProduct(int id, Product product){
        return repository.updateById(id, product);
    }

    public List<Product> searchByName(String name){
        return repository.searchByName(name);
    }

    public List<Product> filterProduct(int min, int max){
        return repository.filterProduct(min, max);
    }
}
