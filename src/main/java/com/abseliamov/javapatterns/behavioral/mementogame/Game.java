package com.abseliamov.javapatterns.behavioral.mementogame;

import java.util.Date;

public class Game {
    private String level;
    private Date date;

    public void setLevelAndDate(String level) {
        this.level = level;
        this.date = new Date();
    }

    public void load(Save save) {
        level = save.getLevel();
        date = save.getDate();
    }

    public Save save() {
        return new Save(level);
    }

    @Override
    public String toString() {
        return "Game:\n" +
                "\tLevel: " + level +
                "\n\tDate: " + date + "\n";
    }
}
