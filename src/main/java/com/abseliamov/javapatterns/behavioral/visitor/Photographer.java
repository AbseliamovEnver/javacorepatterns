package com.abseliamov.javapatterns.behavioral.visitor;

public class Photographer implements User {
    @Override
    public void useProgram(OperatingSystem operatingSystem) {
        System.out.println("Loads the Windows operating system...");
    }

    @Override
    public void useProgram(TypicalProgram typicalProgram) {
        System.out.println("Launches Adobe Photoshop for photo editing...");
    }

    @Override
    public void useProgram(InternetResource internetResource) {
        System.out.println("Uploads photos to the https://www.shutterstock.com site...");
    }
}
