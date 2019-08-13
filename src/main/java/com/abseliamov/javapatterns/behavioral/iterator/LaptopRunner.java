package com.abseliamov.javapatterns.behavioral.iterator;

public class LaptopRunner {
    public static void main(String[] args) {
        String[] parameters = {"Display = 15.6\"", "SDD = 1Tb", "DDR4 = 32Gb", "Graphics card = 512Mb"};

        Laptop laptop = new Laptop("Apple", parameters);
        Iterator iterator = laptop.getIterator();

        System.out.println("Laptop producer: " + laptop.getProducer());
        System.out.println("Parameters: ");

        while (iterator.hasNext()){
            System.out.println("\t" + iterator.next().toString());
        }
    }
}
