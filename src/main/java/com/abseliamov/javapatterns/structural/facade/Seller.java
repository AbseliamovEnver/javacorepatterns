package com.abseliamov.javapatterns.structural.facade;

public class Seller {
    public void sellsGoods(Good good){
        if (good.isGoodsInStock()){
            System.out.println("Seller sells goods...");
        }else {
            System.out.println("The seller closed the store...");
        }
    }
}
