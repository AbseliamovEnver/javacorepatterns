package com.abseliamov.javapatterns.creational.builder;

public class DellPrecisionBuilder extends LaptopBuilder {
    @Override
    void buildModel() {
        laptop.setModel("Precision");
    }

    @Override
    void buildProducer() {
        laptop.setProducer(Producer.DELL);
    }

    @Override
    void buildPrice() {
        laptop.setPrice(2000);
    }
}
