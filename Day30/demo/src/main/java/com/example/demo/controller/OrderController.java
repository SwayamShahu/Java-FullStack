package com.example.demo.controller;

import com.example.demo.model.Order;
import com.example.demo.service.OrderServiceImpl;
import com.example.demo.service.ProductService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;

@RestController
@RequestMapping("/order")
//    createOrder, getOrderById, getAllOrder, updateStatus, cancelOrder
public class OrderController {
    private OrderServiceImpl service;
    public OrderController(OrderServiceImpl orderService){

        this.service = orderService;
    }

    @PutMapping
    public ResponseEntity<Order> createOrder(@RequestBody Order order){
        Order o = new Order(order.getProductId(), order.getQty(), order.getAmount(), order.getStatus());
        try {
            return new ResponseEntity<>(service.createOrder(o), HttpStatus.OK);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> getOrderById(@PathVariable String id){
        try {
            return new ResponseEntity<>(service.getOrderById(id), HttpStatus.OK);
        }catch (Exception e){
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Order>> getAllOrder(){
        try {
            return new ResponseEntity<>(service.getAllOrder(), HttpStatus.OK);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping("/updateStatus")
    public ResponseEntity<Order> updateStatus(@RequestParam String id, @RequestParam String status){
        try {
            return new ResponseEntity<>(service.updateStatus(id,status), HttpStatus.OK);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping
    public ResponseEntity<Order> cancelOrder(Order order){
        try {
            return new ResponseEntity<>(service.cancelOrder(order), HttpStatus.OK);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
}
