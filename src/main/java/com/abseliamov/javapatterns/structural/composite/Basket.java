package com.abseliamov.javapatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Product> products = new ArrayList<>();


    public void addProduct(Product product) {
        products.add(product);
    }

    public void delete(Product product){
        products.remove(product);
    }

    public void createOrder() {
        System.out.println("Creates an order...");

        for (Product product : products) {
            product.createProduct();
        }
    }
}
