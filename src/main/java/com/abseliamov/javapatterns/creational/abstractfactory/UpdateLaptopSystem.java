package com.abseliamov.javapatterns.creational.abstractfactory;

import com.abseliamov.javapatterns.creational.abstractfactory.laptopService.LaptopServiceFactory;

public class UpdateLaptopSystem {
    public static void main(String[] args) {
        ServiceFactory serviceFactory = new LaptopServiceFactory();
        Device device = serviceFactory.getDevice();
        OperatingSystem operatingSystem = serviceFactory.getOperatingSystem();
        ServiceEngineer serviceEngineer = serviceFactory.getSpecialist();

        System.out.println("Issue a service kit to an engineer for work...");
        device.getDevice();
        operatingSystem.getOperatingSystem();
        serviceEngineer.setupSystem();
    }
}
