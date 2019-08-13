package com.abseliamov.javapatterns.creational.factorymethod;

public class SmartphoneFactory implements MobileDeviceFactory {
    @Override
    public MobileDevice createMobileDevice() {
        return new Smartphone();
    }
}
