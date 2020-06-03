package com.sda.personal;

public class Student extends Persoana{
    private Statut statut;
    public Student(String nume, double numarDeTelefon, String adresaEmail, Adresa adresa,Statut statut) {
        super(nume, numarDeTelefon, adresaEmail, adresa);
        this.statut = statut;
    }

    @Override
    public String toString() {
        return getClass().toString();
    }
}
