package com.abseliamov.javapatterns.behavioral.strategy;

public class Retrospective implements State {
    @Override
    public void doAction() {
        System.out.println("Retrospective meeting...\n");
    }
}
