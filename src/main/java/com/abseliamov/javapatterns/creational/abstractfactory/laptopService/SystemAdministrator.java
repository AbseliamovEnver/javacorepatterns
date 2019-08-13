package com.abseliamov.javapatterns.creational.abstractfactory.laptopService;

import com.abseliamov.javapatterns.creational.abstractfactory.ServiceEngineer;

public class SystemAdministrator implements ServiceEngineer {
    @Override
    public void setupSystem() {
        System.out.println("System administrator has installed new Windows to laptop...");
    }
}
