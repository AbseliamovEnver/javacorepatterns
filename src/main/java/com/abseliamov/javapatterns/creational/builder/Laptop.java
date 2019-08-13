package com.abseliamov.javapatterns.creational.builder;

public class Laptop {
    private String model;
    private Producer producer;
    private int price;

    public void setModel(String model) {
        this.model = model;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "model='" + model + '\'' +
                ", producer=" + producer +
                ", price=" + price +
                '}';
    }
}
