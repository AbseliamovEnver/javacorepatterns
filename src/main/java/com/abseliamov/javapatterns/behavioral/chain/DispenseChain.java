package com.abseliamov.javapatterns.behavioral.chain;

public abstract class DispenseChain {
    private int note;
    private DispenseChain nextDispenseChain;

    public DispenseChain(int note) {
        this.note = note;
    }

    public void setNextChain(DispenseChain nextChain) {
        this.nextDispenseChain = nextChain;
    }

    public void dispenseManager(Currency currency) {
        if (currency.getAmount() % 10 != 0) {
            System.out.println("Amount should be in multiple of 10s.");
        }
        if (currency.getAmount() >= note) {
            int number = currency.getAmount() / note;
            int remainder = currency.getAmount() % note;
            if (number > 0) {
                write(number, note);
            }
            if (remainder != 0 && nextDispenseChain != null) {
                nextDispenseChain.dispenseManager(new Currency(remainder));
            }
        } else {
            nextDispenseChain.dispenseManager(currency);
        }
    }

    public abstract void write(int number, int note);
}
