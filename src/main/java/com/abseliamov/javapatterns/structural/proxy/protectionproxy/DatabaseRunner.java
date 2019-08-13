package com.abseliamov.javapatterns.structural.proxy.protectionproxy;

public class DatabaseRunner {
    public static void main(String[] args) {
        User admin = new User("admin");
        User user = new User("user");
        User guest = new User("guest");

        DatabaseAccess adminAccess = new ProxyDatabaseAccess(admin);
        DatabaseAccess userAccess = new ProxyDatabaseAccess(user);
        DatabaseAccess guestAccess = new ProxyDatabaseAccess(guest);

        adminAccess.provideAccess();
        userAccess.provideAccess();
        guestAccess.provideAccess();
    }
}
