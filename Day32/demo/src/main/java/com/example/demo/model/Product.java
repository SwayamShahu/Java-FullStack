package com.example.demo.model;

public class Product {
    private int productId;
    private String name;
    private double price;
    private  String type;
    private double gstPercentage;
    private int stockQuantity;


    public Product(int productId, String type, double cost, String name, double gstPercentage, int stockQuantity) {
        this.productId = productId;
        this.type = type;
        this.price = cost;
        this.name = name;
        this.gstPercentage = gstPercentage;
        this.stockQuantity = stockQuantity;
    }

    public Product() {
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getGstPercentage() {
        return gstPercentage;
    }

    public void setGstPercentage(double gstPercentage) {
        this.gstPercentage = gstPercentage;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
