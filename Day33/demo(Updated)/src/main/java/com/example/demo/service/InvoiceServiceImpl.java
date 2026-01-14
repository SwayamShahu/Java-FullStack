package com.example.demo.service;

import com.example.demo.model.Order;
import com.example.demo.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository repository;

    public OrderServiceImpl(OrderRepository repository) {
        this.repository = repository;
    }

    @Override
    public Order createOrder(Order order) {
        order.setOrderId(UUID.randomUUID().toString());
        order.setStatus("CREATED");
        return repository.createOrder(order);
    }

    @Override
    public Order getOrderById(String id) {
        return repository.getOrderById(id);
    }

    @Override
    public List<Order> getAllOrders() {
        return repository.getAllOrders();
    }

    @Override
    public Order updateStatus(String id, String status) {
        return repository.updateStatus(id, status);
    }

    @Override
    public boolean cancelOrder(String id) {
        return repository.deleteOrder(id);
    }
}
