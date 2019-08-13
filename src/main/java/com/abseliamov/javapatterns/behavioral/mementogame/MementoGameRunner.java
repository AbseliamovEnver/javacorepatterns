package com.abseliamov.javapatterns.behavioral.mementogame;

public class MementoGameRunner {
    public static void main(String[] args) {
        Game game = new Game();
        SaveFile saveFile = new SaveFile();

        System.out.println("Beginning of the \"Mission Memento\" game. Level 1.");
        game.setLevelAndDate("Level 1");

        System.out.println(game);

        System.out.println("Level 1 completed. Save.\n");
        saveFile.setSave(game.save());

        System.out.println("Continue the game.\nLevel 2 completed. Save.\n");
        game.setLevelAndDate("Level 2");

        System.out.println(game);

        System.out.println("Continue the game.\nLevel 3 mission failed...\n");

        System.out.println("Start the game from the second level");
        game.load(saveFile.getSave());

        System.out.println(game);
    }
}
