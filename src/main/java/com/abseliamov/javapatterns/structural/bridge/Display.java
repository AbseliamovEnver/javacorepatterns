package com.abseliamov.javapatterns.structural.bridge;

public class Display extends Product{
    protected Display(Producer producer) {
        super(producer);
    }

    @Override
    public void producerProduct() {
        System.out.println("Display production in progress...");
        producer.makeProduct();
    }
}
