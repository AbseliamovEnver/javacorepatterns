package com.abseliamov.javapatterns.behavioral.command;

public class SellProduct implements Order {
    OnlineStore store;

    public SellProduct(OnlineStore store) {
        this.store = store;
    }

    @Override
    public void execute() {
        store.sellProduct();
    }
}
