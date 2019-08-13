package com.abseliamov.javapatterns.creational.abstractfactory;

import com.abseliamov.javapatterns.creational.abstractfactory.mobileService.MobileServiceFactory;

public class InstallMobileSystem {
    public static void main(String[] args) {
        ServiceFactory serviceFactory = new MobileServiceFactory();
        Device device = serviceFactory.getDevice();
        OperatingSystem operatingSystem = serviceFactory.getOperatingSystem();
        ServiceEngineer serviceEngineer = serviceFactory.getSpecialist();

        System.out.println("Issue a service kit to an engineer for work...");
        device.getDevice();
        operatingSystem.getOperatingSystem();
        serviceEngineer.setupSystem();
    }
}
