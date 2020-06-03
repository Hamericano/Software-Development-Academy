package com.sda.blocul;

import java.util.ArrayList;
import java.util.List;

public class Etaj {
    private int numarEtaj;
    private List<Apartament> apartamente = new ArrayList<>();

    public Etaj(int numarEtaj) {
        this.numarEtaj = numarEtaj;
    }

    public int getNumarEtaj() {
        return numarEtaj;
    }

    public void adaugaApartament(Apartament apartament) {
        apartamente.add(apartament);
    }

    public List<Apartament> getApartamente() {
        return apartamente;
    }

    public void afisareEtaj(){
        for(Apartament apartament : apartamente){
            System.out.println("|| " + apartament.getNumarApartament() + " . " + apartament.getNumeFamilie() + " ||");
        }
    }
}
