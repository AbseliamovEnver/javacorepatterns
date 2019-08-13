package com.abseliamov.javapatterns.structural.bridge;

public class ProductCreator {
    public static void main(String[] args) {
//        Product laptop = new Laptop(new AppleProducer());
//        Product display = new Display(new DellProducer());
//
//        laptop.producerProduct();
//        display.producerProduct();

        Product[] products = {
                new Laptop(new AppleProducer()),
                new Display(new DellProducer())
        };

        for (Product product : products) {
            product.producerProduct();
        }
    }
}
