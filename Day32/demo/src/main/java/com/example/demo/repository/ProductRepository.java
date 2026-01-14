package com.example.demo.repository;

import com.example.demo.exception.ProductNotFound;
import com.example.demo.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {
    private final ArrayList<Product> list = new ArrayList<>();

    public List<Product> findAll(){
        return list;
    }

    public Product findById(int id){
        return list.stream().filter(p -> p.getProductId() == id).findFirst().orElse(null);
    }

    public void save(Product product){
        list.add(product);
    }

    public Product deleteById(int id){
//        list = list.stream().filter(p -> p.getProductId() != id); Final Error

            // Error -> Cannot used lamba index
//        list.stream().map((p,index) -> {
//            p.getProductId() == id ? list.remove(index): null ;
//        });
        Product p = new Product();
        //Method 1
        for(int i = 0; i < list.size(); i++){
            if (list.get(i).getProductId() == id ){
                p = list.get(i);
                list.remove(i);

            }
        }

        return p;

        // Method 2 List Collection -> removeif()
//        list.removeIf(product -> product.getProductId() == id);
    }

    public Product updateById(int id, Product product){
        Product existingProduct = findById(id);
        if (existingProduct != null){
            existingProduct.setName(product.getName());
            existingProduct.setType(product.getType());
            existingProduct.setPrice(product.getPrice());
            existingProduct.setGstPercentage(product.getGstPercentage());
            existingProduct.setStockQuantity(product.getStockQuantity());
            return existingProduct;
        }else{
            throw new ProductNotFound("Product not found");
        }
    }

    public List<Product> searchByName(String name){
//        System.out.println(name);
        return list.stream().filter((product -> product.getName().toLowerCase().contains(name.toLowerCase()) )).toList();
    }

    public  List<Product> filterProduct(int min, int max){
        return list.stream().filter(product -> product.getPrice() > min && product.getPrice() < max).toList();
    }
}

// Spring boot 😊
// Annotation -> @SpringBootApplication,@RestController, @RequestMapping, @GetMapping, @PostMapping, @DeleteMapping, @PutMapping, @PatchMapping, @PathVariable(get URL Object), @RequestBody(JSON Object), @Service ,@Repository