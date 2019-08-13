package com.abseliamov.javapatterns.creational.builder;

public class LaptopBuilderRunner {
    public static void main(String[] args) {
        Creator creator = new Creator();

        creator.setBuilder(new DellPrecisionBuilder());
        Laptop laptop = creator.buildLaptop();

        System.out.println(laptop);
    }
}
