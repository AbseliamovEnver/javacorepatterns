package com.abseliamov.javapatterns.structural.bridge;

public abstract class Product {
    protected Producer producer;

    protected Product(Producer producer) {
        this.producer = producer;
    }

    public abstract void producerProduct();
}
