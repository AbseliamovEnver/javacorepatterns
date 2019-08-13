package com.abseliamov.javapatterns.creational.abstractfactory.mobileService;

import com.abseliamov.javapatterns.creational.abstractfactory.Device;

public class Smartphone implements Device {
    @Override
    public void getDevice() {
        System.out.println("The smartphone is given to the service ...");
    }
}
