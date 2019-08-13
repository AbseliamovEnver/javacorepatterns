package com.abseliamov.javapatterns.creational.factorymethod;

public class TabletFactory implements MobileDeviceFactory{
    @Override
    public MobileDevice createMobileDevice() {
        return new Tablet();
    }
}
