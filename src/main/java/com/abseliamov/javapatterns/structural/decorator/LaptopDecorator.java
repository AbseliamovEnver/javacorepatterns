package com.abseliamov.javapatterns.structural.decorator;

public class LaptopDecorator implements Laptop {

    Laptop laptop;

    public LaptopDecorator(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public double getCost() {
        return laptop.getCost();
    }

    @Override
    public String getKit() {
        return laptop.getKit();
    }
}
