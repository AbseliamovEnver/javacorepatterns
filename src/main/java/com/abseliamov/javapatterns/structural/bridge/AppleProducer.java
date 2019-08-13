package com.abseliamov.javapatterns.structural.bridge;

public class AppleProducer implements Producer{
    @Override
    public void makeProduct() {
        System.out.println("Apple produces a product...\n");
    }
}
