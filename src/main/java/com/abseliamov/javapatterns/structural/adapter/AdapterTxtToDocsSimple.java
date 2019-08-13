package com.abseliamov.javapatterns.structural.adapter;

public class AdapterTxtToDocsSimple implements FileReader {
    ReadApplication reader = new ReadApplication();

    @Override
    public void ReadFromDocs() {
        reader.readFromTXT();
    }
}
