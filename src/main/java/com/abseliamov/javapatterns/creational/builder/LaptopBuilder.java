package com.abseliamov.javapatterns.creational.builder;

public abstract class LaptopBuilder {
    Laptop laptop;

    void createLaptop() {
        laptop = new Laptop();
    }

    abstract void buildModel();

    abstract void buildProducer();

    abstract void buildPrice();

    Laptop getLaptop(){
        return laptop;
    }
}
