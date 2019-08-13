package com.abseliamov.javapatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class LaptopFactory {
    private static final Map<String, Laptop> laptops = new HashMap<>();

    public Laptop getLaptopByProducer(String producer) {
        Laptop laptop = laptops.get(producer);

        if (laptop == null) {
            switch (producer) {
                case "Apple":
                    System.out.println("By a new laptop Apple...");
                    laptop = new AppleLaptop();
                    break;
                case "Dell":
                    System.out.println("By a new laptop Dell...");
                    laptop = new DellLaptop();
                    break;
                default:
                    System.out.println("Unknown laptop...");
                    break;
            }
            laptops.put(producer, laptop);
        }
        return laptop;
    }
}
