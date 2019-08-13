package com.abseliamov.javapatterns.behavioral.strategy;

public class SprintCycle {
    public static void main(String[] args) {
        Sprint sprint = new Sprint();

        sprint.setState(new Planning());
        sprint.executeState();

        sprint.setState(new DailyScrum());
        sprint.executeState();

        sprint.setState(new Review());
        sprint.executeState();

        sprint.setState(new Retrospective());
        sprint.executeState();

        sprint.setState(new Planning());
        sprint.executeState();
    }
}
