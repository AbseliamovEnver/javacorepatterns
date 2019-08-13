package com.abseliamov.javapatterns.structural.proxy.protectionproxy;

public class ProxyDatabaseAccess implements DatabaseAccess {

    private User user;

    public ProxyDatabaseAccess(User user) {
        this.user = user;
    }

    @Override
    public void provideAccess() {
        RealDatabaseAccess access;

        if (isUser()) {
            access = new RealDatabaseAccess(user);
            access.provideAccess();
        } else if (isAdmin()) {
            access = new RealDatabaseAccess(user);
            access.provideAccess();
        } else {
            System.out.println("Access denied: " + user.getUserRole());
        }
    }

    private boolean isUser() {
        return user.getUserRole().equalsIgnoreCase("user");
    }

    private boolean isAdmin() {
        return user.getUserRole().equalsIgnoreCase("admin");
    }
}
