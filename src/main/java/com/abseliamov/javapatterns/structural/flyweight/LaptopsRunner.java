package com.abseliamov.javapatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class LaptopsRunner {
    public static void main(String[] args) {
        LaptopFactory laptopFactory = new LaptopFactory();

        List<Laptop> laptops = new ArrayList<>();

        laptops.add(laptopFactory.getLaptopByProducer("Apple"));
        laptops.add(laptopFactory.getLaptopByProducer("Apple"));
        laptops.add(laptopFactory.getLaptopByProducer("Apple"));
        laptops.add(laptopFactory.getLaptopByProducer("Dell"));
        laptops.add(laptopFactory.getLaptopByProducer("Dell"));

        for (Laptop laptop: laptops){
            laptop.usedLaptop();
        }
    }
}