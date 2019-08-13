package com.abseliamov.javapatterns.structural.composite;

public class Order {
    public static void main(String[] args) {
        Basket basket = new Basket();

        Product laptop = new Laptop();
        Product display = new Display();
        Product tablet = new Tablet();

        basket.addProduct(laptop);
        basket.addProduct(display);
        basket.addProduct(tablet);

        basket.createOrder();
    }
}
