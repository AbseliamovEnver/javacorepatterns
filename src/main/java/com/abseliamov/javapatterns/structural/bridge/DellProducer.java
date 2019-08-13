package com.abseliamov.javapatterns.structural.bridge;

public class DellProducer implements Producer{
    @Override
    public void makeProduct() {
        System.out.println("Dell produces a product...\n");
    }
}
