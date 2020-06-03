package com.sda.personal;

public class Persoana {
    private String nume;
    private double numarDeTelefon;
    private String adresaEmail;
    private Adresa adresa;

    public Persoana(String nume, double numarDeTelefon, String adresaEmail, Adresa adresa) {
        this.nume = nume;
        this.numarDeTelefon = numarDeTelefon;
        this.adresaEmail = adresaEmail;
        this.adresa = adresa;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getNumarDeTelefon() {
        return numarDeTelefon;
    }

    public void setNumarDeTelefon(double numarDeTelefon) {
        this.numarDeTelefon = numarDeTelefon;
    }

    public String getAdresaEmail() {
        return adresaEmail;
    }

    public void setAdresaEmail(String adresaEmail) {
        this.adresaEmail = adresaEmail;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }
    @Override
    public String toString() {
        return getClass().toString();
    }
}
