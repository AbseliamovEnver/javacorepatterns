package com.abseliamov.javapatterns.behavioral.command;

public class BuyProduct implements Order {
    OnlineStore store;

    public BuyProduct(OnlineStore store) {
        this.store = store;
    }

    @Override
    public void execute() {
        store.buyProduct();
    }
}
