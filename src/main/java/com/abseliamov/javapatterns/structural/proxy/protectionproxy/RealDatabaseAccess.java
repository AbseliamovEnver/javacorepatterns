package com.abseliamov.javapatterns.structural.proxy.protectionproxy;

public class RealDatabaseAccess implements DatabaseAccess {

    private User user;

    public RealDatabaseAccess(User user) {
        this.user = user;
    }

    @Override
    public void provideAccess() {
        System.out.println("Access confirmed: " + user.getUserRole());
    }
}
