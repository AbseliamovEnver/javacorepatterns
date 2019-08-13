package com.abseliamov.javapatterns.behavioral.template;

public class AppleLaptop extends LaptopTemplate{
    @Override
    public void parameterDifferences() {
        System.out.println("Producer: APPLE");
        System.out.println("Operating system: Macintosh OS");
        System.out.println("RAM size: 64Gb");
        System.out.println("SDD size: 512Gb");
        System.out.println("Price: 3000$");
    }
}
