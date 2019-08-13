package com.abseliamov.javapatterns.creational.prototype;

public class LaptopCopyRunner {
    public static void main(String[] args) {
        Laptop original = new Laptop("APPLE", "MacBook", 2000);

        System.out.println("ORIGINAL: " + original + "\n\n");

        LaptopFactory factory = new LaptopFactory(original);
        Laptop originalClone = factory.cloneLaptop();
        System.out.println("CLONE: " + originalClone);
    }
}
