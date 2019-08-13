package com.abseliamov.javapatterns.creational.factorymethod;

public class Smartphone implements MobileDevice {
    @Override
    public void createDevice() {
        System.out.println("Create smartphone...");
    }
}
