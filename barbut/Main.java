package com.sda.barbut;

public class Main {
    public static void main(String[] args) {
        Player playerOne = new Player("Mihai");
        Player playerTwo = new Player("Alex");

        BarbutGame barbutGame = new BarbutGame(playerOne, playerTwo);
        barbutGame.startGame();
    }
}
