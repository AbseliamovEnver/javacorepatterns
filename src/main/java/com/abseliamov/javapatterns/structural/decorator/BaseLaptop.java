package com.abseliamov.javapatterns.structural.decorator;

public class BaseLaptop implements Laptop{
    @Override
    public double getCost() {
        return 1500.0;
    }

    @Override
    public String getKit() {
        return "Basic laptop kit";
    }
}
