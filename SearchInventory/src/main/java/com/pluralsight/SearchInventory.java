package com.pluralsight;

import java.util.ArrayList;
import java.io.*;


public class SearchInventory {
    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();

        System.out.println("Store Inventory: ");
        for (int i = 0; i < inventory.size(); i++) {
            System.out.println(inventory.get(i));
        }
    }

    public static ArrayList<Product> getInventory() {
        ArrayList<Product> product = new ArrayList<>();
        product .add(new Product("Laptop", "Electronics", 499.99));
        product .add(new Product("Mouse", "Electornics", 49.99));
        product .add(new Product("Table", "Furniture", 149.99));
        product .add(new Product("Chair", "Furniture", 99.99));

        return product;

    }

}
