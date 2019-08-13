package com.abseliamov.javapatterns.behavioral.chain;

public class NoteDispense10 extends DispenseChain {

    public NoteDispense10(int note) {
        super(note);
    }

    @Override
    public void write(int number, int note) {
        System.out.println("Dispensing " + number + " " + note + "$ note");
    }
}
