package com.abseliamov.javapatterns.creational.abstractfactory.mobileService;

import com.abseliamov.javapatterns.creational.abstractfactory.OperatingSystem;

public class AndroidSystem implements OperatingSystem {
    @Override
    public void getOperatingSystem() {
        System.out.println("The Android with a new license given to the service...");
    }
}
