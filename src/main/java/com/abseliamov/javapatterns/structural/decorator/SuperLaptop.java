package com.abseliamov.javapatterns.structural.decorator;

public class SuperLaptop extends LaptopDecorator {

    public SuperLaptop(Laptop laptop) {
        super(laptop);
    }

    @Override
    public double getCost() {
        return super.getCost() + 500.0;
    }

    @Override
    public String getKit() {
        return super.getKit() + " + SDD 1Tb";
    }
}
