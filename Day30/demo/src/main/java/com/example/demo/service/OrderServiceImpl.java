package com.example.demo.service;

import com.example.demo.model.Order;
import com.example.demo.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }


    @Override
    public Order createOrder(Order order) {
        try {
            return orderRepository.createOrder(order);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public Order getOrderById(String orderId) {
        try {
            return orderRepository.getOrderById(orderId);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public List<Order> getAllOrder() {
        try {
            return orderRepository.getAllOrder();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public Order updateStatus(String orderId, String status) {
        try {
            return orderRepository.updateStatus(orderId, status);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public Order cancelOrder(Order order) {
        try {
            return orderRepository.cancelOrder(order);
        } catch (Exception e) {
            throw e;
        }
    }
}
