package com.abseliamov.javapatterns.structural.proxy.virtualproxy;

public class RealPage implements BrowserPage {
    private String url;

    public RealPage(String url) {
        this.url = url;
        downloadPage();
    }

    private void downloadPage() {
        System.out.println("Downloading page " + url);
    }

    @Override
    public void displayPage() {
        System.out.println("Displaying page " + url);
    }
}
