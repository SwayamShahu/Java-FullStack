package com.example.demo.repository;

import com.example.demo.exception.ProductNotFound;
import com.example.demo.model.Product;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository {

    private final JdbcTemplate jdbcTemplate;

    public ProductRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private final RowMapper<Product> rowMapper = (rs, rowNum) -> {
        Product p = new Product();
        p.setProductId(rs.getInt("product_id"));
        p.setName(rs.getString("name"));
        p.setPrice(rs.getDouble("price"));
        p.setType(rs.getString("type"));
        p.setGstPercentage(rs.getDouble("gst_percentage"));
        p.setStockQuantity(rs.getInt("stock_quantity"));
        return p;
    };

    public List<Product> findAll(){
        return jdbcTemplate.query("SELECT * FROM product", rowMapper);
    }

    public Product findById(int id){
        List<Product> list = jdbcTemplate.query(
                "SELECT * FROM product WHERE product_id=?",
                rowMapper, id);
        return list.isEmpty() ? null : list.get(0);
    }

    public void save(Product product){
        String sql = "INSERT INTO product VALUES (?,?,?,?,?,?)";
        jdbcTemplate.update(sql,
                product.getProductId(),
                product.getName(),
                product.getPrice(),
                product.getType(),
                product.getGstPercentage(),
                product.getStockQuantity());
    }

    public Product deleteById(int id){
        Product p = findById(id);
        if (p != null) {
            jdbcTemplate.update("DELETE FROM product WHERE product_id=?", id);
            return p;
        }
        return null;
    }

    public Product updateById(int id, Product product){
        Product existing = findById(id);
        if (existing == null) {
            throw new ProductNotFound("Product not found");
        }

        String sql = """
            UPDATE product SET
            name=?, price=?, type=?, gst_percentage=?, stock_quantity=?
            WHERE product_id=?
        """;

        jdbcTemplate.update(sql,
                product.getName(),
                product.getPrice(),
                product.getType(),
                product.getGstPercentage(),
                product.getStockQuantity(),
                id);

        return findById(id);
    }

    public List<Product> searchByName(String name){
        return jdbcTemplate.query(
                "SELECT * FROM product WHERE LOWER(name) LIKE ?",
                rowMapper, "%" + name.toLowerCase() + "%");
    }

    public List<Product> filterProduct(int min, int max){
        return jdbcTemplate.query(
                "SELECT * FROM product WHERE price BETWEEN ? AND ?",
                rowMapper, min, max);
    }
}
