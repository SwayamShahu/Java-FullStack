package com.foodapp.model;
public class Inventory {
    private int id;
    private String name;

    public Inventory(int id, double price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    private double price;

    public Inventory() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
