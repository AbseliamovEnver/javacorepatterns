package com.abseliamov.javapatterns.creational.abstractfactory.laptopService;

import com.abseliamov.javapatterns.creational.abstractfactory.Device;
import com.abseliamov.javapatterns.creational.abstractfactory.OperatingSystem;
import com.abseliamov.javapatterns.creational.abstractfactory.ServiceEngineer;
import com.abseliamov.javapatterns.creational.abstractfactory.ServiceFactory;

public class LaptopServiceFactory implements ServiceFactory {
    @Override
    public Device getDevice() {
        return new Laptop();
    }

    @Override
    public OperatingSystem getOperatingSystem() {
        return new WindowsSystem();
    }

    @Override
    public ServiceEngineer getSpecialist() {
        return new SystemAdministrator();
    }
}
