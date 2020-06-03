package com.sda.blocul;

public class Apartament {
    private String numeFamilie;
    private int numarApartament;

    public Apartament(String numeFamilie, int numarApartament) {
        this.numeFamilie = numeFamilie;
        this.numarApartament = numarApartament;
    }

    public String getNumeFamilie() {
        return numeFamilie;
    }

    public int getNumarApartament() {
        return numarApartament;
    }
}
