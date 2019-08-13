package com.abseliamov.javapatterns.creational.factorymethod;

public class Program {
    public static void main(String[] args) {
//        MobileDeviceFactory mobileDeviceFactory = createMobileDeviceByType("Laptop");
//        MobileDeviceFactory mobileDeviceFactory = createMobileDeviceByType("Smartphone");
        MobileDeviceFactory mobileDeviceFactory = createMobileDeviceByType("tablet");

        MobileDevice mobileDevice = mobileDeviceFactory.createMobileDevice();

        mobileDevice.createDevice();
    }

    static MobileDeviceFactory createMobileDeviceByType(String typeMobileDevice) {
        if (typeMobileDevice.equalsIgnoreCase("laptop")) {
            return new LaptopFactory();
        } else if (typeMobileDevice.equalsIgnoreCase("smartphone")) {
            return new SmartphoneFactory();
        } else if (typeMobileDevice.equalsIgnoreCase("tablet")) {
            return new TabletFactory();
        } else {
            throw new RuntimeException(typeMobileDevice + " is unknown device...");
        }
    }
}
