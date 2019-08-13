package com.abseliamov.javapatterns.behavioral.state;

public class DailyScrum implements State {
    @Override
    public void doAction() {
        for (int i = 1; i < 5; i++) {
            System.out.println("Daily Scrum... " + i);
        }
    }
}
