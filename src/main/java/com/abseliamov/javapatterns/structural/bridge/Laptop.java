package com.abseliamov.javapatterns.structural.bridge;

public class Laptop extends Product{
    protected Laptop(Producer producer) {
        super(producer);
    }

    @Override
    public void producerProduct() {
        System.out.println("Laptop production in progress...");
        producer.makeProduct();
    }
}
