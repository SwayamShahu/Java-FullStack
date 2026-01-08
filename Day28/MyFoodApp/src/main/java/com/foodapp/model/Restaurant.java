package com.foodapp.model;

public class Restaurant {
    private int resId;
    private String name;
    private double latitude;

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public double getLongitube() {
        return longitube;
    }

    public void setLongitube(double longitube) {
        this.longitube = longitube;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDeliveryRange() {
        return deliveryRange;
    }

    public void setDeliveryRange(int deliveryRange) {
        this.deliveryRange = deliveryRange;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Restaurant() {
    }

    private double longitube;
    private int deliveryRange;
    private String address;
    private int rating;

}
