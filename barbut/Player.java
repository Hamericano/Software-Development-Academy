package com.sda.barbut;

public class Player {
    private int dicesResult;
    private Dice diceOne;
    private Dice diceTwo;
    private String name;

    public Player(String name) {
        this.diceOne = new Dice();
        this.diceTwo = new Dice();
        this.name = name;
    }

    public void Roll(){
        int rollOne, rollTwo;

        rollOne = (int)(Math.random() * 6 + 1);
        int diceOneResult = diceOne.getDiceValue(rollOne);
        rollTwo = (int)(Math.random() * 6 + 1);
        int diceTwoResult = diceTwo.getDiceValue(rollTwo);
        dicesResult = diceOneResult + diceTwoResult;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDicesResult() {
        return dicesResult;
    }
}
