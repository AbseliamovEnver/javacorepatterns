package com.abseliamov.javapatterns.behavioral.observer;

public class OnlineElectronicsStore {
    public static void main(String[] args) {
        LaptopStore laptopStore = new LaptopStore();

        laptopStore.addLaptop("APPLE MacBook Pro");
        laptopStore.addLaptop("DELL Precision");

        Observer customer1 = new Customer("John");
        Observer customer2 = new Customer("Tom");

        laptopStore.addObserver(customer1);
        laptopStore.addObserver(customer2);

        laptopStore.addLaptop("ASUS ROG");

        laptopStore.removeLaptop("APPLE MacBook Pro");
    }
}
