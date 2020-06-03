package com.sda.game;

public class NonPlayerCharacter extends GameMaster{
    private double healthPoints;
    private int attackPower;

    public NonPlayerCharacter(double healthPoints, int attackPower) {
        this.healthPoints = healthPoints;
        this.attackPower = attackPower;
    }

    public double getHealthPoints() {
        return healthPoints;
    }

    public int getAttackPower() {
        return attackPower;
    }
    public void attack(Hero hero) {
        hero.decreaseLife(this.getAttackPower());
        System.out.println("O sa te atac! ");
    }

    @Override
    public void decreaseLife(int value) {
        healthPoints = this.getHealthPoints() - value;
    }
}
