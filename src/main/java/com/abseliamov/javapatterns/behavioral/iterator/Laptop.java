package com.abseliamov.javapatterns.behavioral.iterator;

public class Laptop implements Collection {
    private String producer;
    private String[] parameters;

    public Laptop(String producer, String[] parameters) {
        this.producer = producer;
        this.parameters = parameters;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String[] getParameters() {
        return parameters;
    }

    public void setParameters(String[] parameters) {
        this.parameters = parameters;
    }

    @Override
    public Iterator getIterator() {
        return new ParameterIterator();
    }

    private class ParameterIterator implements Iterator {
        private int index;

        @Override
        public boolean hasNext() {
            return index < parameters.length;
        }

        @Override
        public Object next() {
            return parameters[index++];
        }
    }
}
