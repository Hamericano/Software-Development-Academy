package com.sda.dreptunghi;

public class Dreptunghi {
    private double latime;
    private double lungime;

    public Dreptunghi(){
        this.latime = 1;
        this.lungime = 1;
    }

    public Dreptunghi(double latime, double lungime){
        this.latime = latime;
        this.lungime = lungime;
    }

    public double arie(){
        return this.lungime * this.latime;
    }

    public double perimetru(){
        return 2 * (this.latime + this.lungime);
    }

}
