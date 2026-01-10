package com.example.demo.repository;

import com.example.demo.model.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepository {
    private final List<Order> list = new ArrayList<>();

    public Order createOrder(Order order){
        try {
            list.add(order);
            return order;
        }catch (Exception e){
            throw e;
        }
    }

    public Order getOrderById(String orderId){
        try{
            return list.stream().filter(order -> orderId == order.getOrderId()).findFirst().orElse(null);
        }catch (Exception e){
            throw e;
        }
    }

    public List<Order> getAllOrder() {
        try {
            return list;
        } catch (Exception e) {
            throw e;
        }
    }

    public Order updateStatus(String orderId, String status){
        Order order = new Order();
        try {
            for (int i = 0; i < list.size(); i++){
                if (list.get(i).getOrderId() == orderId){
                    order = list.get(i);
                    list.get(i).setStatus(status);
                }
            }
            return order;
        }catch (Exception e){
            throw e;
        }
    }

    public Order cancelOrder(Order order){
        Order deleteOrder = new Order();
        try{
            for (int i = 0; i < list.size(); i++){
                if (order.getOrderId() == list.get(i).getOrderId()){
                    deleteOrder = list.get(i);
                    list.remove(i);
                }
            }
            return order;
        } catch (Exception e) {
            throw e;
        }
    }
}
