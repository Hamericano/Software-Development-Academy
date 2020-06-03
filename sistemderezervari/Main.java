package com.sda.sistemderezervari;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BookingSystemApp systemApp = new BookingSystemApp();
        do{
            System.out.println("0.Iesire \n1.Adaugare restaurant. \n2.Rezerva masa. \n3.Afiseaza restaurante. \n4.Afiseaza rezervari.\n");
            int option = input.nextInt();
            switch(option){
                case 0:{
                    System.out.println("Exiting. . .");
                    System.exit(0);
                    break;
                }
                case 1:{
                    systemApp.addRestaurant();
                    break;
                }
                case 2:{
                    System.out.println("La ce restaurant doresti sa rezervi? ");
                    systemApp.listAllRestaurants();
                    int choice = input.nextInt();
                    systemApp.book(choice);
                    break;
                }
                case 3:{
                    systemApp.listAllRestaurants();
                    break;
                }
                case 4:{
                    System.out.println("La ce restaurant doresti sa verifici rezervarile? ");
                    systemApp.listAllRestaurants();
                    int choice = input.nextInt();
                    systemApp.listAllBookingsBetween(choice);
                    break;
                }
            }
        }while(true);

    }
}
