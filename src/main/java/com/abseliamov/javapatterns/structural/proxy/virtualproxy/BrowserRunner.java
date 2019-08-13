package com.abseliamov.javapatterns.structural.proxy.virtualproxy;

public class BrowserRunner {
    public static void main(String[] args) {
        BrowserPage google = new ProxyPage("google.com");
        BrowserPage yahoo = new ProxyPage("yahoo.com");

        google.displayPage();
        yahoo.displayPage();

        google.displayPage();
        yahoo.displayPage();
    }
}
