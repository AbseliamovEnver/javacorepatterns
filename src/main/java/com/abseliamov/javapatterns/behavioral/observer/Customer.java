package com.abseliamov.javapatterns.behavioral.observer;

import java.util.List;

public class Customer implements Observer {
    String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> laptops) {
        System.out.println("Hi, " + name +
                "\nWe have some changes in laptop models:\n" + laptops + "\n");
    }
}
