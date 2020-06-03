package com.sda.comparable;
import static org.junit.Assert.assertEquals;

public class Main {
    public static void main(String[] args) {
        Patrat patrat1 = new Patrat(2);
        Patrat patrat2 = new Patrat(3);
        System.out.println(patrat1.compareTo(patrat2));
        assertEquals(patrat1.compareTo(patrat2), "-1");

        Person person1 = new Person("Mihai", 21);
        Person person2 = new Person("Alexandra", 20);

        System.out.println(person1.compareTo(person2));
        assertEquals(person1.compareTo(person2), "Alexandra este mai mic(a).");



    }
}
