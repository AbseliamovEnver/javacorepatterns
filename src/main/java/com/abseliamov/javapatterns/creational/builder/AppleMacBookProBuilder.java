package com.abseliamov.javapatterns.creational.builder;

public class AppleMacBookProBuilder extends LaptopBuilder {
    @Override
    void buildModel() {
        laptop.setModel("MacBook Pro");
    }

    @Override
    void buildProducer() {
        laptop.setProducer(Producer.APPLE);
    }

    @Override
    void buildPrice() {
        laptop.setPrice(5000);
    }
}
