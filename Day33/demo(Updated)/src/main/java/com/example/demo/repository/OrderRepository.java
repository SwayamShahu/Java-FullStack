package com.example.demo.repository;

import com.example.demo.model.Order;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderRepository {

    private final JdbcTemplate jdbcTemplate;

    public OrderRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private final RowMapper<Order> rowMapper = (rs, rowNum) -> {
        Order order = new Order();
        order.setOrderId(rs.getString("order_id"));
        order.setProductId(rs.getString("product_id"));
        order.setQty(rs.getInt("quantity"));
        order.setAmount(rs.getDouble("amount"));
        order.setStatus(rs.getString("status"));
        order.setCustomerId(rs.getInt("customer_id"));
        return order;
    };

    public Order createOrder(Order order) {
        jdbcTemplate.update(
                "INSERT INTO orders(order_id, product_id, quantity, amount, status, customer_id) VALUES(?,?,?,?,?,?)",
                order.getOrderId(),
                order.getProductId(),
                order.getQty(),
                order.getAmount(),
                order.getStatus(),
                order.getCustomerId()
        );
        return order;
    }

    public Order getOrderById(String id) {
        String sql = "SELECT * FROM orders WHERE order_id=?";
        List<Order> list = jdbcTemplate.query(sql, rowMapper, id);
        return list.isEmpty() ? null : list.get(0);
    }

    public List<Order> getAllOrders() {
        return jdbcTemplate.query("SELECT * FROM orders", rowMapper);
    }

    public Order updateStatus(String id, String status) {
        String sql = "UPDATE orders SET status=? WHERE order_id=?";
        int rows = jdbcTemplate.update(sql, status, id);
        return rows > 0 ? getOrderById(id) : null;
    }

    public boolean deleteOrder(String id) {
        String sql = "DELETE FROM orders WHERE order_id=?";
        return jdbcTemplate.update(sql, id) > 0;
    }
}
