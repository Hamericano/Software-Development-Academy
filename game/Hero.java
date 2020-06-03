package com.sda.game;

public class Hero extends GameMaster{
    private double healthPoints;
    private int attackPower;

    public Hero(double healthPoints, int attackPower) {
        this.healthPoints = healthPoints;
        this.attackPower = attackPower;
    }

    public double getHealthPoints() {
        return healthPoints;
    }

    public int getAttackPower() {
        return attackPower;
    }
    public void attack(NonPlayerCharacter npc) {
        npc.decreaseLife(this.getAttackPower());
    }

    @Override
    public void decreaseLife(int value) {
        healthPoints = this.getHealthPoints() - value;
    }
}
