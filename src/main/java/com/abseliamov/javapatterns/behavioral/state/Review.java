package com.abseliamov.javapatterns.behavioral.state;

public class Review implements State {
    @Override
    public void doAction() {
        System.out.println("Sprint review...");
    }
}
