package com.abseliamov.javapatterns.structural.decorator;

public class AverageLaptop extends LaptopDecorator {

    public AverageLaptop(Laptop laptop) {
        super(laptop);
    }

    @Override
    public double getCost() {
        return super.getCost() + 300.0;
    }

    @Override
    public String getKit() {
        return super.getKit() + " + DDR4 16Gb";
    }
}
