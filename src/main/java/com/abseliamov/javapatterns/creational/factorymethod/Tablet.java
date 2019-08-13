package com.abseliamov.javapatterns.creational.factorymethod;

public class Tablet implements MobileDevice{
    @Override
    public void createDevice() {
        System.out.println("Create tablet...");
    }
}
