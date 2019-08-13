package com.abseliamov.javapatterns.behavioral.visitor;

public class InternetResource implements ComputerProgram {
    @Override
    public void useComputer(User user) {
        user.useProgram(this);
    }
}
