package com.abseliamov.javapatterns.structural.composite;

public class Display implements Product {
    @Override
    public void createProduct() {
        System.out.println("Display added to order...");
    }
}
