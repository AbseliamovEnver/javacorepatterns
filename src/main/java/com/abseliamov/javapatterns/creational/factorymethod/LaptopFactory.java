package com.abseliamov.javapatterns.creational.factorymethod;

public class LaptopFactory implements MobileDeviceFactory {
    @Override
    public MobileDevice createMobileDevice() {
        return new Laptop();
    }
}
