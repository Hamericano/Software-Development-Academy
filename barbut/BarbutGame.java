package com.sda.barbut;

import java.util.Scanner;

public class BarbutGame {
    private Player playerOne;
    private Player playerTwo;

    public BarbutGame(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    private void checkWinner(Player playerOne, Player playerTwo) {
        int resultOne = playerOne.getDicesResult();
        int resultTwo = playerTwo.getDicesResult();

        if (resultOne > resultTwo) {
            System.out.println("Player " + playerOne.getName() + " Wins !!! ");
        } else if (resultOne == resultTwo) {
            System.out.println("Is Draw.");
        } else {
            System.out.println("Player " + playerTwo.getName() + " Wins !!! ");
        }
    }

    Scanner input = new Scanner(System.in);

    public void startGame() {
        System.out.println("Player " + playerOne.getName() + " ready? ");
        if (input.next().equalsIgnoreCase("Yes")) {
            playerOne.Roll();
            System.out.println("Player " + playerOne.getName() + " rolled " + playerOne.getDicesResult() + " \n");
        }
        System.out.println("Player " + playerTwo.getName() + " ready? ");
        if (input.next().equalsIgnoreCase("Yes")) {
            playerTwo.Roll();
            System.out.println("Player " + playerTwo.getName() + " rolled " + playerTwo.getDicesResult() + " \n");
        }
        checkWinner(playerOne, playerTwo);
    }
}
