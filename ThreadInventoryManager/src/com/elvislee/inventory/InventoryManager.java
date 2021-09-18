package com.elvislee.inventory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryManager {
    // Since we want the arraylist to be thread safe, we have to use the concurrent version of ArrayList, not the regular ArrayList
    List<Product> soldProductsList = new CopyOnWriteArrayList<>();

    public void populateSoldProducts() {
        for(int i = 0; i < 500; i++) {
            Product product = new Product(i, "test_product_" + i);
            soldProductsList.add(product);
            System.out.println("Added: " + product.toString());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void displaySoldProducts() {
        for(Product product : soldProductsList) {
            System.out.println("Printing the sold: " + product.toString());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
