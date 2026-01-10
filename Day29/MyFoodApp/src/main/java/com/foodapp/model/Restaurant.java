package com.foodapp.model;

public class Restaurant {
    private int resId;
    private float rating;
    private double latitude;
    private double longitube;
    private double radius;

    public Restaurant() {
    }

    public Restaurant(double radius, double latitude, double longitube, float rating, int resId) {
        this.radius = radius;
        this.latitude = latitude;
        this.longitube = longitube;
        this.rating = rating;
        this.resId = resId;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
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

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
