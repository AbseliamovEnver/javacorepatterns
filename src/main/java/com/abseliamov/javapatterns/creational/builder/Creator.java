package com.abseliamov.javapatterns.creational.builder;

public class Creator {
    LaptopBuilder builder;

    public void setBuilder(LaptopBuilder builder){
        this.builder = builder;
    }

    Laptop buildLaptop(){
        builder.createLaptop();
        builder.buildModel();
        builder.buildProducer();
        builder.buildPrice();

        Laptop laptop = builder.getLaptop();

        return laptop;
    }
}
