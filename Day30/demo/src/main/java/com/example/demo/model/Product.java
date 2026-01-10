package com.example.demo.model;

public class Product {
    private int productId;
    private String name;
    private double cost;
    private  String type;

    public Product(int productId, String type, double cost, String name) {
        this.productId = productId;
        this.type = type;
        this.cost = cost;
        this.name = name;
    }

    public Product() {
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
