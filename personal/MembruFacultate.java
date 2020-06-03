package com.sda.personal;

public class MembruFacultate extends Angajat{
    private double oreBirou;
    private String rang;

    public MembruFacultate(String nume, double numarDeTelefon, String adresaEmail,
                           Adresa adresa, DataAngajare dataAngajare, double salariu, double oreBirou, String rang) {
        super(nume, numarDeTelefon, adresaEmail, adresa, dataAngajare, salariu);
        this.oreBirou = oreBirou;
        this.rang = rang;
    }

    public double getOreBirou() {
        return oreBirou;
    }

    public void setOreBirou(double oreBirou) {
        this.oreBirou = oreBirou;
    }

    public String getRang() {
        return rang;
    }

    public void setRang(String rang) {
        this.rang = rang;
    }
    @Override
    public String toString() {
        return getClass().toString();
    }
}
