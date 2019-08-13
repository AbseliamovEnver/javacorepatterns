package com.abseliamov.javapatterns.structural.adapter;

public class AdapterTxtToDocs extends ReadApplication implements FileReader {
    @Override
    public void ReadFromDocs() {
        readFromTXT();
    }
}
