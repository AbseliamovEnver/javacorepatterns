package com.abseliamov.javapatterns.behavioral.visitor;

public interface User {
    void useProgram(OperatingSystem operatingSystem);

    void useProgram(TypicalProgram typicalProgram);

    void useProgram(InternetResource internetResource);
}
