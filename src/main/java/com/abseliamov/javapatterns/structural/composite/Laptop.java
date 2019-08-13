package com.abseliamov.javapatterns.structural.composite;

public class Laptop implements Product {
    @Override
    public void createProduct() {
        System.out.println("Laptop added to order...");
    }
}
