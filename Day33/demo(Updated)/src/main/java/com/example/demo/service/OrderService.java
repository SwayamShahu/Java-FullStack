package com.example.demo.service;

import com.example.demo.model.Order;
import java.util.List;

public interface OrderService {
    Order createOrder(Order order);
    Order getOrderById(String id);
    List<Order> getAllOrders();
    Order updateStatus(String id, String status);
    boolean cancelOrder(String id);
}
