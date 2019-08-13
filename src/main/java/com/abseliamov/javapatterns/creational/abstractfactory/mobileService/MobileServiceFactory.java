package com.abseliamov.javapatterns.creational.abstractfactory.mobileService;

import com.abseliamov.javapatterns.creational.abstractfactory.Device;
import com.abseliamov.javapatterns.creational.abstractfactory.OperatingSystem;
import com.abseliamov.javapatterns.creational.abstractfactory.ServiceEngineer;
import com.abseliamov.javapatterns.creational.abstractfactory.ServiceFactory;

public class MobileServiceFactory implements ServiceFactory {
    @Override
    public Device getDevice() {
        return new Smartphone();
    }

    @Override
    public OperatingSystem getOperatingSystem() {
        return new AndroidSystem();
    }

    @Override
    public ServiceEngineer getSpecialist() {
        return new AndroidDeveloper();
    }
}
