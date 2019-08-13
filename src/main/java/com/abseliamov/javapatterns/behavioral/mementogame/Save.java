package com.abseliamov.javapatterns.behavioral.mementogame;

import java.util.Date;

public class Save {
    private final String level;
    private final Date date;

    public Save(String level) {
        this.level = level;
        this.date = new Date();
    }

    public String getLevel() {
        return level;
    }

    public Date getDate() {
        return date;
    }
}
