package com.abseliamov.javapatterns.behavioral.observer;

import java.util.List;

public interface Observer {
    void handleEvent(List<String> laptops);
}
