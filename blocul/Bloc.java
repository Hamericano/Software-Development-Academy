package com.sda.blocul;

import java.util.ArrayList;
import java.util.List;

public class Bloc {
    private String numeBloc;
    private List<Etaj> etaje = new ArrayList<>();

    public Bloc(String numeBloc) {
        this.numeBloc = numeBloc;
    }

    public void adaugaEtaj(Etaj etaj) {
        etaje.add(etaj);
    }

    public void afiseazaBloc() {
        for (int i = 0; i < etaje.size(); i++) {
            Etaj etaj = etaje.get(i);
            System.out.println("---------------------------------");
            System.out.println("---------------------------------");
            System.out.println("Etaj - " + etaj.getNumarEtaj());
            etaj.afisareEtaj();
        }
    }
}
