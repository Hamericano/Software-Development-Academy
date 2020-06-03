package com.sda.stock;

public class Stock {
    private String simbol;
    private String stoc;
    private double closingPrice;
    private double currentPrice;

    public Stock(String simbol, String stoc, double closingPrice, double currentPrice) {
        this.simbol = simbol;
        this.stoc = stoc;
        this.closingPrice = closingPrice;
        this.currentPrice = currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double getChangePercent() {
        double percent = 0.0;
        if (currentPrice > closingPrice) {
            percent = (float) ((closingPrice * 100) / currentPrice);
        } else if (currentPrice == closingPrice) {
            percent = 0;
        } else if (currentPrice < closingPrice) {
            percent = (float) ((currentPrice * 100) / closingPrice);
        }
        return percent;
    }
}
