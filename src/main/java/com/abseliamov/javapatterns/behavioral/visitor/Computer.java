package com.abseliamov.javapatterns.behavioral.visitor;

public class Computer implements ComputerProgram {
    ComputerProgram[] computerPrograms;

    public Computer() {
        this.computerPrograms = new ComputerProgram[]{
                new OperatingSystem(),
                new TypicalProgram(),
                new InternetResource()
        };
    }

    @Override
    public void useComputer(User user) {
        for (ComputerProgram program : computerPrograms) {
            program.useComputer(user);
        }
    }
}
