package com.abseliamov.javapatterns.behavioral.chain;

public class NoteDispense100 extends DispenseChain {

    public NoteDispense100(int note) {
        super(note);
    }

    @Override
    public void write(int number, int note) {
        System.out.println("Dispensing " + number + " " + note + "$ note");
    }
}
