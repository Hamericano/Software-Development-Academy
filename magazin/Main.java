package com.sda.magazin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Magazin magazin = new Magazin();

        Produs produs1 = new Fructe(12,"Mere","1254","Proaspete", "Brasilia SRL",
                UnitateDeMasura.KILOGRAM, new Date(2022, 4, 3), new Date(2017, 2, 31),"Brazilia" );
        Produs produs2 = new Carne(15,"Carne", "1500", "Proaspata", "Butcher SRL",
                UnitateDeMasura.KILOGRAM, new Date(2023,4,22), new Date(2019,5,28), TipCarne.PUI);
        Produs produs3 = new Haine(150.5, "Blugi", "1230", "Carrot", "Blugi SRL",
                UnitateDeMasura.BUCATA, "Denim");

        magazin.adaugaInStoc(produs1, 15);
        magazin.adaugaInStoc(produs2, 35);
        magazin.adaugaInStoc(produs3, 10);


        do{
            System.out.println("\n0.Exit \n1.Afiseaza stoc. \n2.Afiseaza cos. \n3.Cumpara produs. \n4.Cumpara tot ce este in cos. \n5.Cauta produs in stoc. \n6.Adauga in cos.\n");
            int option = input.nextInt();
            switch(option){
                case 1:{
                    System.out.println("\t\tSTOC ");
                    magazin.afiseazaStoc();
                    break;
                }
                case 2:{
                    System.out.println("\t\tCOS ");
                    magazin.afiseazaCos();
                    break;
                }
                case 3:{
                    System.out.println("Introduceti produsul pe care doriti sa il cumparati. ");
                    String numeProdus = input.next();
                    magazin.cumparaProdus(numeProdus);
                    break;
                }
                case 4:{
                    magazin.cumparaProduse();
                    break;
                }
                case 5:{
                    System.out.println("Ce produs cautati? ");
                    String numeProdus = input.next();
                    magazin.cautaProdus(numeProdus);
                    break;
                }
                case 6:{
                    System.out.println("Introduceti ce produs doriti sa adaugati in cos. ");
                    String numeProdus = input.next();
                    magazin.adaugaInCos(numeProdus);
                    break;
                }
                case 0:{
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                }
            }
        }while(true);
    }
}
