package com.abseliamov.javapatterns.creational.abstractfactory;

public interface ServiceFactory {
    Device getDevice();
    OperatingSystem getOperatingSystem();
    ServiceEngineer getSpecialist();
}
