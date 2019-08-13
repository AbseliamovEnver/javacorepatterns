package com.abseliamov.javapatterns.structural.proxy.protectionproxy;

public class User {
    private String userRole;

    public User(String userRole) {
        this.userRole = userRole;
    }

    public String getUserRole() {
        return userRole;
    }
}
