package factory;

import builder.TableBuilder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FactoryTable factory =  new FactoryTable();
        int option = -1;
        while(option != 0){
            System.out.println("1.Buy Oak Table \n2.Buy Beech Table");
            option = scanner.nextInt();
            scanner.nextLine();
            TableBuilder.Table table = factory.getTable(option);
            System.out.println("I have bought a table of " + table.getMaterial());
        }
    }
}
