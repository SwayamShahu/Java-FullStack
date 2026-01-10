package com.example.demo.service;

import com.example.demo.model.Order;

import java.util.List;

//  Methods -> createOrder, getOrderById, getAllOrder, updateStatus, cancelOrder
public interface OrderService {
    public Order createOrder(Order order);
    public Order getOrderById(String orderId);
    public List<Order> getAllOrder();
    public Order updateStatus(String orderId, String status);
    public Order cancelOrder(Order order);
}
