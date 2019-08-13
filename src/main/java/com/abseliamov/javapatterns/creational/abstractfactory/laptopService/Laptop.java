package com.abseliamov.javapatterns.creational.abstractfactory.laptopService;

import com.abseliamov.javapatterns.creational.abstractfactory.Device;

public class Laptop implements Device {
    @Override
    public void getDevice() {
        System.out.println("The laptop is given to the service ...");
    }
}
