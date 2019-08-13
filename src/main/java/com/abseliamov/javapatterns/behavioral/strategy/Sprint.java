package com.abseliamov.javapatterns.behavioral.strategy;

public class Sprint {
    State state;

    public void setState(State state) {
        this.state = state;
    }

    public void executeState() {
        state.doAction();
    }
}
