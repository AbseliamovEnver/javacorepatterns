package com.abseliamov.javapatterns.creational.abstractfactory.laptopService;

import com.abseliamov.javapatterns.creational.abstractfactory.OperatingSystem;

public class WindowsSystem implements OperatingSystem {
    @Override
    public void getOperatingSystem() {
        System.out.println("The Windows with a new license given to the service...");
    }
}
