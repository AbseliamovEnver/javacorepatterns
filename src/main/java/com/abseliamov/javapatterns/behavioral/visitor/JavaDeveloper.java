package com.abseliamov.javapatterns.behavioral.visitor;

public class JavaDeveloper implements User {
    @Override
    public void useProgram(OperatingSystem operatingSystem) {
        System.out.println("Loads the Linux operating system...");
    }

    @Override
    public void useProgram(TypicalProgram typicalProgram) {
        System.out.println("Launches the Intellij IDEA for coding...");
    }

    @Override
    public void useProgram(InternetResource internetResource) {
        System.out.println("Uploads code to the https://github.com site...");
    }
}
