package com.abseliamov.javapatterns.creational.prototype;

public class LaptopFactory {
    Laptop laptop;

    public LaptopFactory(Laptop laptop) {
        this.laptop = laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public Laptop cloneLaptop() {
        return (Laptop) laptop.copy();
    }
}
