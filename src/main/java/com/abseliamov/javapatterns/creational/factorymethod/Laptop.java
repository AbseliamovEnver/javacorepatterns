package com.abseliamov.javapatterns.creational.factorymethod;

public class Laptop implements MobileDevice {
    @Override
    public void createDevice() {
        System.out.println("Create laptop...");
    }
}
