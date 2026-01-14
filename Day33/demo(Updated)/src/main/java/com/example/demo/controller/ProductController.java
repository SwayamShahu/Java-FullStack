package com.example.demo.controller;

import com.example.demo.exception.ProductNotFound;
import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


// RestAPI - it used for communication of different application over internet via HTTP methods(GET, POST, DELETE, PUT, etc)

// It is a architecture style not a protocol

// Resources -> any data or object(product as a JSON object)

// URIs / URLs -> Uniform resource identifier (used for unique identity)
// Example -> http://localhost:8080/products

// Statelessness -> Each req from a client to the server must contain all the info necessary to understand and process it.

// Representation -> JSON, XML, HTML

// How API works -> 1. Client sends the request
//                  2. Server process request
//                  3. Server sends the Response

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService service;

    public ProductController(ProductService productService){
        this.service = productService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Product>> getAll(){
        return new ResponseEntity<>(service.getAllProducts(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Product> createProduct(@RequestBody Product product){
        return new ResponseEntity<>(service.createProduct(product), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getById(@PathVariable int id){
        Product p = service.findById(id);
        return p == null ? ResponseEntity.notFound().build() : ResponseEntity.ok(p);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Product> deleteById(@PathVariable int id){
        Product p = service.deleteById(id);
        return p == null ? ResponseEntity.notFound().build() : ResponseEntity.ok(p);
    }

    @PutMapping("{id}")
    public ResponseEntity<Product> updateById(@PathVariable int id, @RequestBody Product p){
        try {
            return ResponseEntity.ok(service.updateProduct(id, p));
        } catch (ProductNotFound e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/search/{name}")
    public List<Product> searchByName(@PathVariable String name){
        return service.searchByName(name);
    }

    @GetMapping("/filter")
    public List<Product> filterProduct(@RequestParam int min, @RequestParam int max){
        return service.filterProduct(min, max);
    }
}
