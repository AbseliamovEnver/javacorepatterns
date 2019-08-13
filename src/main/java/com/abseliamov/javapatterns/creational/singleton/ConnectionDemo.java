package com.abseliamov.javapatterns.creational.singleton;

public class ConnectionDemo {
    public static void main(String[] args) {
        Connection connection = new ConnectionFactory();
        PoolConnection poolConnection = connection.create();

        System.out.println("Create first connection...");
        for (int i = 2; i < 10; i++) {
            if (connection.create() != poolConnection){
                System.out.println("Create new " + i + " connection...");
            }
        }
    }
}
