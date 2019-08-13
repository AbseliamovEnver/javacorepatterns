package com.abseliamov.javapatterns.structural.adapter;

public class FileReaderRunner {
    public static void main(String[] args) {
        FileReader reader = new AdapterTxtToDocs();

        reader.ReadFromDocs();

        FileReader readerSimple = new AdapterTxtToDocsSimple();
        readerSimple.ReadFromDocs();
    }
}
