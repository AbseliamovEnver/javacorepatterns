package com.abseliamov.javapatterns.behavioral.state;

public class SprintCycle {
    public static void main(String[] args) {
        State state = new Planning();
        Sprint sprint = new Sprint();

        sprint.setState(state);

        for (int i = 0; i < 12; i++) {
            sprint.doAction();
            sprint.changeState();
        }
    }
}
