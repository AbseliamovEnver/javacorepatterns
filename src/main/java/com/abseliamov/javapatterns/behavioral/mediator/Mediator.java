package com.abseliamov.javapatterns.behavioral.mediator;

public interface Mediator {
    void addUser(User user);

    void sendMessage(User user, String message);
}
