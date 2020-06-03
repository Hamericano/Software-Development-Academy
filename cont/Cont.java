package com.sda.cont;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cont {
    private int id = 0;
    private double sold = 0.0;
    private static double anualInterestRate = 0.0;
    private Date dateCreated;

    public Cont() {
        SimpleDateFormat formater= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        this.dateCreated = new Date(System.currentTimeMillis());
        System.out.println("Contul a fost creat la " + formater.format(dateCreated));

    }

    public Cont(int id, double sold) {
        this.id = id;
        this.sold = sold;
        SimpleDateFormat formater= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        this.dateCreated = new Date(System.currentTimeMillis());
        System.out.println("Contul a fost creat la " + formater.format(dateCreated));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSold() {
        return sold;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }

    public static double getAnualInterestRate() {
        return anualInterestRate;
    }

    public static void setAnualInterestRate(double anualInterestRate) {
        Cont.anualInterestRate = anualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void deposit(double amount){
        System.out.println("Adding " + amount + " $ to your account...");
        this.sold = this.sold + amount;
    }

    public void withdraw(double amount){
        if(amount <= getSold()){
            System.out.println("Substracting " + amount + " $ from your account...");
            this.sold -= amount;
        }
        else
            System.out.println("Amount exceeded sold!");
    }

    public double getMonthlyInterest(double interestRate){
        double interest = 0.0;
        if(this.sold > 1000){
            interest = this.sold * (interestRate/100) * 30/365;
        }
        return interest;
    }














}
