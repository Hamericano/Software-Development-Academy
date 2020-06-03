package com.sda.dreptunghi;

public class Main {
    public static void main(String[] args) {
        Dreptunghi dreptunghi1 = new Dreptunghi(10.5,15.2);

        System.out.println("Aria dreptunghiului1 este " + dreptunghi1.arie());
        System.out.println("Perimetru dreptunghiului1 este " + dreptunghi1.perimetru());

        Dreptunghi dreptunghi2 = new Dreptunghi();

        System.out.println("Aria dreptunghiului2 este " + dreptunghi2.arie());
        System.out.println("Perimetru dreptunghiului2 este " + dreptunghi2.perimetru());



    }
}
