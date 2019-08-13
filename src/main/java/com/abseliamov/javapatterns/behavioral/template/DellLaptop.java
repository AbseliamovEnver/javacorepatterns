package com.abseliamov.javapatterns.behavioral.template;

public class DellLaptop extends LaptopTemplate{
    @Override
    public void parameterDifferences() {
        System.out.println("Producer: DELL");
        System.out.println("Operating system: Linux");
        System.out.println("RAM size: 32Gb");
        System.out.println("SDD size: 1Tb");
        System.out.println("Price: 2000$");
    }
}
