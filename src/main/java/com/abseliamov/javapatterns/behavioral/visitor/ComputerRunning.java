package com.abseliamov.javapatterns.behavioral.visitor;

public class ComputerRunning {
    public static void main(String[] args) {
        Computer computer = new Computer();

        User javaDeveloper = new JavaDeveloper();
        User photographer = new Photographer();

        System.out.println("Java developer starts working on a computer...");
        computer.useComputer(javaDeveloper);

        System.out.println("\n***********************************************\n");

        System.out.println("The photographer begins to work at the computer...");
        computer.useComputer(photographer);


    }
}
