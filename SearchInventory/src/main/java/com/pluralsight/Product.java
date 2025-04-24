package com.pluralsight;

public class Product {

    private String name;
    private String category;
    private double price;

    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;

    }
    public  String toString() {
        return name + "(" + category + ") $" + price;
    }
}

