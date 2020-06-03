package com.sda.stock;

public class Main {
    public static void main(String[] args) {
        Stock myStock = new Stock("A", "Apa", 42.2, 99.5);
        System.out.printf("%.1f", myStock.getChangePercent());
        System.out.print("%");
        System.out.println();
        myStock.setCurrentPrice(12.1);
        System.out.printf("%.1f", myStock.getChangePercent());
        System.out.print("%");
        System.out.println();
        myStock.setCurrentPrice(42.2);
        System.out.printf("%.1f", myStock.getChangePercent());
        System.out.print("%");

    }
}
