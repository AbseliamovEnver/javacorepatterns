package com.abseliamov.javapatterns.behavioral.template;

public class LaptopRunner {
    public static void main(String[] args) {
        LaptopTemplate apple = new AppleLaptop();
        LaptopTemplate dell = new DellLaptop();

        apple.showLaptop();

        System.out.println("\n******************************\n");

        dell.showLaptop();
    }
}
