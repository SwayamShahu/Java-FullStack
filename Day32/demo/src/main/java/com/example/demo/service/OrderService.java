package com.example.demo.service;

import com.example.demo.model.Order;
import java.util.List;

public interface OrderService {
    Order createOrder(Order order);
    Order getOrderById(String orderId);
    List<Order> getAllOrder();
    Order updateStatus(String orderId, String status);
    Order cancelOrder(String orderId);
}
