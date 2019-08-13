package com.abseliamov.javapatterns.behavioral.state;

public class Sprint {
    State state;

    public void setState(State state) {
        this.state = state;
    }

    public void changeState() {
        if (state instanceof Planning) {
            setState(new DailyScrum());
        } else if (state instanceof DailyScrum) {
            setState(new Review());
        } else if (state instanceof Review) {
            setState(new Retrospective());
        } else if (state instanceof Retrospective) {
            setState(new Planning());
        }
    }

    public void doAction() {
        state.doAction();
    }
}
