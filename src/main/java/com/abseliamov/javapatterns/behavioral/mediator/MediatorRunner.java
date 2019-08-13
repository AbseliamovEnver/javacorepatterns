package com.abseliamov.javapatterns.behavioral.mediator;

public class MediatorRunner {
    public static void main(String[] args) {
        Mediator mediator = new ChatMediator();

        User admin = new ChatParticipant(mediator, "Admin");
        User user1 = new ChatParticipant(mediator, "User 1");
        User user2 = new ChatParticipant(mediator, "User 2");

        mediator.addUser(admin);
        mediator.addUser(user1);
        mediator.addUser(user2);

        user1.send("Hello!!! I'am User 1.");

        System.out.println();

        admin.send("Hi! I'am admin!");
    }
}
