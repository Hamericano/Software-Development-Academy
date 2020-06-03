package builder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TableBuilder OakTableBuilder = new TableBuilder();

        OakTableBuilder.setColor("Dark brown");
        OakTableBuilder.setMaterial("Oak Wood");
        OakTableBuilder.setLength(100);
        OakTableBuilder.setWidth(80);
        OakTableBuilder.setHeight(60);
        OakTableBuilder.setHasRoundCorners(true);
        OakTableBuilder.setHasShinySurface(false);

        TableBuilder BeechTableBuilder = new TableBuilder();

        BeechTableBuilder.setColor("Light brown");
        BeechTableBuilder.setMaterial("Beech Wood");
        BeechTableBuilder.setHeight(70);
        BeechTableBuilder.setWidth(80);
        BeechTableBuilder.setLength(150);
        BeechTableBuilder.setHasRoundCorners(false);
        BeechTableBuilder.setHasShinySurface(true);

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1.Buy Oak Table \n2.Buy Beech Table \n\n0.Exit");
            int option = scanner.nextInt();
            scanner.nextLine();
            if(option == 1){
                TableBuilder.Table table = OakTableBuilder.build();
                System.out.println("Oak Table Sold!");
            }else if(option == 2){
                TableBuilder.Table table = BeechTableBuilder.build();
                System.out.println("Beech Table Sold!");
            }else if(option == 0){
                System.exit(0);
            }
        } while (true);
    }
}
