package com.abseliamov.javapatterns.structural.proxy.virtualproxy;

public class ProxyPage implements BrowserPage{

    private String url;
    private RealPage realPage;

    public ProxyPage(String url) {
        this.url = url;
    }

    @Override
    public void displayPage() {
        if (realPage== null){
            realPage = new RealPage(url);
        }
        realPage.displayPage();
    }
}
