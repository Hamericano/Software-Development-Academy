package com.sda.personal;

public class Angajat extends Persoana {
    private DataAngajare dataAngajare;
    private double salariu;

    public Angajat(String nume, double numarDeTelefon, String adresaEmail,
                   Adresa adresa, DataAngajare dataAngajare, double salariu) {
        super(nume, numarDeTelefon, adresaEmail, adresa);
    }

    public DataAngajare getDataAngajare() {
        return dataAngajare;
    }

    public void setDataAngajare(DataAngajare dataAngajare) {
        this.dataAngajare = dataAngajare;
    }

    public double getSalariu() {
        return salariu;
    }

    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        return getClass().toString();
    }
}
