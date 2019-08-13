package com.abseliamov.javapatterns.behavioral.template;

public abstract class LaptopTemplate {
    public void showLaptop() {
        System.out.println("Activity laptop: Business.");
        System.out.println("Display size: 15.6\" IPS");
        System.out.println("Hard drive type: SDD.");
        System.out.println("Processor type: Intel Core i9.");

        parameterDifferences();
    }

    public abstract void parameterDifferences();
}
