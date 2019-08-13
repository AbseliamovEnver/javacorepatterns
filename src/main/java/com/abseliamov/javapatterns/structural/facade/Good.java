package com.abseliamov.javapatterns.structural.facade;

public class Good {
    private boolean goodsInStock;

    public boolean isGoodsInStock() {
        return goodsInStock;
    }

    public void startAssembly() {
        System.out.println("Goods in stock...");
        goodsInStock = true;
    }

    public void finishAssembly() {
        System.out.println("Goods is out of stock...");
        goodsInStock = false;
    }
}
