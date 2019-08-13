package com.abseliamov.javapatterns.behavioral.mediator;

public class ChatParticipant extends User {

    public ChatParticipant(Mediator mediator, String nickname) {
        super(mediator, nickname);
    }

    @Override
    public void send(String message) {
        System.out.println(nickname + " write message " + message);
        mediator.sendMessage(this, message);
    }

    @Override
    public void receive(String message) {
        System.out.println(nickname + " receive message " + message);
    }
}
