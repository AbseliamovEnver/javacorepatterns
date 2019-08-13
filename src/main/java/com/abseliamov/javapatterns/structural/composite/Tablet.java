package com.abseliamov.javapatterns.structural.composite;

public class Tablet implements Product {
    @Override
    public void createProduct() {
        System.out.println("Tablet added to order...");
    }
}
