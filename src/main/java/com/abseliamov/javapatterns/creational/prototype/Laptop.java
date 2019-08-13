package com.abseliamov.javapatterns.creational.prototype;

public class Laptop implements Copyable {
    private String producer;
    private String model;
    private int price;

    public Laptop(String producer, String model, int price) {
        this.producer = producer;
        this.model = model;
        this.price = price;
    }

    @Override
    public Object copy() {
        Laptop copy = new Laptop(producer, model, price);
        return copy;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
