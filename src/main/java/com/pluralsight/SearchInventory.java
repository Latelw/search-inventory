package com.pluralsight;

import java.util.ArrayList;

// Starter for Search Inventory (Workbook 3a, Section 3-2 Using an ArrayList, Exercise 1).
// main is done: it asks getInventory() for the list and prints every product.
// Your job is getInventory(): fill the list with at least 5 products.
public class SearchInventory {
    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();

        for (Product product : inventory) {
            System.out.println(product);
        }
        getInventory();

    }

    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<>();

        // Write your code here
        inventory.add(new Product(4011, "Banana", 1.00));
        inventory.add(new Product(4012, "Apple", 1.25));
        inventory.add(new Product(4013, "Watermelon", 4.75));
        inventory.add(new Product(4014, "Dragonfruit", 2.25));
        inventory.add(new Product(4015, "Melon", 3.75));








        return inventory;
    }
}
 