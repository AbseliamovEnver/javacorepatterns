package com.abseliamov.javapatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class LaptopStore implements Observed {
    List<String> laptops = new ArrayList<>();
    List<Observer> customers = new ArrayList<>();

    public void addLaptop(String modelLaptop) {
        this.laptops.add(modelLaptop);
        notifyObservers();
    }

    public void removeLaptop(String modelLaptop) {
        this.laptops.remove(modelLaptop);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.customers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.customers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer customer : customers) {
            customer.handleEvent(this.laptops);
        }
    }
}
