package com.sda.game;
import static org.junit.Assert.assertEquals;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero(100,10);
        NonPlayerCharacter npc = new NonPlayerCharacter(100,2);
        npc.attack(hero);
        System.out.println(hero.getHealthPoints());
        assertEquals(98, hero.getHealthPoints(),0.0);
        hero.attack(npc);
        System.out.println(npc.getHealthPoints());
        assertEquals(90, npc.getHealthPoints(),0.0);

    }
}
