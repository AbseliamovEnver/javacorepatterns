package com.abseliamov.javapatterns.structural.decorator;

public class LaptopKit {
    public static void main(String[] args) {

        Laptop baseKit = new BaseLaptop();
        System.out.println("Base laptop: " + baseKit.getKit()
                + "\nCost: " + baseKit.getCost());

        Laptop averageKit = new AverageLaptop(new BaseLaptop());
        System.out.println("Average laptop: " + averageKit.getKit()
                + "\nCost: " + averageKit.getCost());

        Laptop superKit = new SuperLaptop(new AverageLaptop(new BaseLaptop()));
        System.out.println("Super laptop: " + superKit.getKit()
                + "\nCost: " + superKit.getCost());
    }
}
