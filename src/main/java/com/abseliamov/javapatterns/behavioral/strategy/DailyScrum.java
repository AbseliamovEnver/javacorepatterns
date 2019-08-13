package com.abseliamov.javapatterns.behavioral.strategy;

public class DailyScrum implements State {
    @Override
    public void doAction() {
        for (int i = 1; i < 4; i++) {
            System.out.println("Daily SCRUM... " + i);
        }
    }
}
