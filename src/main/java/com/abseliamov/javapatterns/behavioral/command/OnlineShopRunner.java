package com.abseliamov.javapatterns.behavioral.command;

public class OnlineShopRunner {
    public static void main(String[] args) {
        OnlineStore store = new OnlineStore();

        Broker broker = new Broker(
                new BuyProduct(store),
                new SellProduct(store)
        );

        broker.buyProduct();
        broker.sellProduct();
    }
}
