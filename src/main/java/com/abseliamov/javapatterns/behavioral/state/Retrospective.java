package com.abseliamov.javapatterns.behavioral.state;

public class Retrospective implements State {
    @Override
    public void doAction() {
        System.out.println("Retrospective meeting...\n");
    }
}
