package com.abseliamov.javapatterns.structural.facade;

public class SaleOfGoods {
    Order order = new Order();
    Good good = new Good();
    Seller seller = new Seller();

    public void SaleGoods(){
        order.assemblyOfGoods();
        good.startAssembly();
        seller.sellsGoods(good);
    }
}
