package com.sda.tv;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean on = true;
        Tv myTv = new Tv(50,25,true);
        do {
            if(myTv.isOnOff()){
                System.out.println();
                System.out.println("1. Inchide televizorul.");
                System.out.println("2. Schimba canalul.");
                System.out.println("3. Schimba canalul in canalul precedent.");
                System.out.println("4. Schimba canalul in canalul urmator.");
                System.out.println("5. Micsoreaza volumul.");
                System.out.println("6. Mareste volumul.");

                System.out.println("0. Scoate televizorul din priza.");
            }
            else {
                System.out.println("7. Porneste televizorul.");
            }
            System.out.println();
            System.out.print("Your choice is ... ");
            int choice = input.nextInt();
            switch(choice){
                case 0:
                {
                    System.exit(0);
                    break;
                }
                case 1:
                {
                    myTv.setOnOff(false);
                    System.out.println("Televizorul se inchide...");
                    break;
                }
                case 2:
                {
                    System.out.print("Pe ce canal doriti sa schimbati? ");
                    myTv.changeTvPostTo(input.nextInt());
                    System.out.println("Canalul a fost schimbat pe " + myTv.getPost());
                    break;
                }
                case 3:
                {
                    System.out.println("Canalul curent este " + myTv.getPost());
                    myTv.previousTvPost();
                    System.out.println("Canalul precedent este " + myTv.getPost());
                    break;
                }
                case 4:
                {
                    System.out.println("Canalul curent este " + myTv.getPost());
                    myTv.nextTvPost();
                    System.out.println("Canalul urmator este " + myTv.getPost());
                    break;
                }
                case 5:
                {
                    myTv.downVolume();
                    System.out.println("Volumul curent este " + myTv.getVolume());
                    break;
                }
                case 6:
                {
                    myTv.upVolume();
                    System.out.println("Volumul curent este " + myTv.getVolume());
                    break;
                }
                case 7:
                {
                    myTv.setOnOff(true);
                    System.out.println("Televizorul se deschide...");
                    break;
                }
            }
        }while(true);
    }
}
