package com.abseliamov.javapatterns.behavioral.mediator;

public abstract class User {
    protected Mediator mediator;
    protected String nickname;

    public User(Mediator mediator, String nickname) {
        this.mediator = mediator;
        this.nickname = nickname;
    }

    public abstract void send(String message);
    public abstract void receive(String message);
}
