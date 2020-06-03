package com.sda.personal;

public class PersonalFacultate extends Angajat{
    private String titlu;
    public PersonalFacultate(String nume, double numarDeTelefon, String adresaEmail,
                             Adresa adresa, DataAngajare dataAngajare, double salariu, String titlu) {
        super(nume, numarDeTelefon, adresaEmail, adresa, dataAngajare, salariu);
        this.titlu = titlu;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }
    @Override
    public String toString() {
        return getClass().toString();
    }
}
