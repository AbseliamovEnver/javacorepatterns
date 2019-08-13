package com.abseliamov.javapatterns.behavioral.state;

public class Planning implements State {
    @Override
    public void doAction() {
        System.out.println("New Sprint...");
        System.out.println("Sprint planning meeting...");
    }
}
