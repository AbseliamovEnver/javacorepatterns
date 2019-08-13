package com.abseliamov.javapatterns.creational.abstractfactory.mobileService;

import com.abseliamov.javapatterns.creational.abstractfactory.ServiceEngineer;

public class AndroidDeveloper implements ServiceEngineer {
    @Override
    public void setupSystem() {
        System.out.println("Android developer has installed new Android to smartphone...");
    }
}
