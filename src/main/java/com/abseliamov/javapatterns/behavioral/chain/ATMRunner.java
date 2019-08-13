package com.abseliamov.javapatterns.behavioral.chain;

public class ATMRunner {
    public static void main(String[] args) {
        DispenseChain note100 = new NoteDispense100(Note.D_100);
        DispenseChain note50 = new NoteDispense50(Note.D_50);
        DispenseChain note20 = new NoteDispense20(Note.D_20);
        DispenseChain note10 = new NoteDispense10(Note.D_10);

        note100.setNextChain(note50);
        note50.setNextChain(note20);
        note20.setNextChain(note10);

        note100.dispenseManager(new Currency(280));
    }
}
