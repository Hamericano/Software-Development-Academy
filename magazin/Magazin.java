package com.sda.magazin;

import java.util.*;
import java.util.stream.Collectors;

public class Magazin {
    private Map<Produs, Integer> stocProduse = new HashMap<>();
    private List<Produs> produse = new ArrayList<>();

    public void adaugaInStoc(Produs produs, int stoc) {
        stocProduse.put(produs, stoc);
    }

    public Produs adaugaInCos(String nume) {
        for (Map.Entry<Produs, Integer> entry : stocProduse.entrySet()) {
            Produs key = entry.getKey();
            int value = entry.getValue();
            if (key.getNume().equalsIgnoreCase(nume)) {
                produse.add(key);
                stocProduse.replace(key, value - 1);
                System.out.println("Produsul " + key.getNume() + " a fost adaugat in cos.");
            }
        }
        return null;
    }


    public Produs cautaProdus(String nume) {
        for (Map.Entry<Produs, Integer> entry : stocProduse.entrySet()) {
            Produs key = entry.getKey();
            int value = entry.getValue();

            if (key.getNume().equalsIgnoreCase(nume)) {
                System.out.println(key.getNume() + " - " + value + " " + key.getUnitateDeMasura().getNume());
                return key;
            }
        }
        return null;
    }

    public Produs cumparaProduse() {
        for (Produs i : produse) {
            for (Map.Entry<Produs, Integer> entry : stocProduse.entrySet()) {
                Produs key = entry.getKey();
                int value = entry.getValue();

                String nume = i.getNume();
                if (nume.equalsIgnoreCase(key.getNume()) && value == 1) {
                    stocProduse.remove(key);
                    break;
                }
            }
        }
        return null;
    }

    public Produs cumparaProdus(String nume) {
        for (Map.Entry<Produs, Integer> entry : stocProduse.entrySet()) {
            Produs key = entry.getKey();
            int value = entry.getValue();
            if (nume.equalsIgnoreCase(key.getNume()) && value > 1) {
                stocProduse.replace(key, value - 1);
                break;
            } else if (nume.equalsIgnoreCase(key.getNume()) && value == 1) {
                stocProduse.remove(key);
                break;
            }
        }
        return null;
    }

    public void afiseazaCos() {
        for(Produs produs : produse) {
            System.out.println(produs.getNume() + " - 1 " + produs.getUnitateDeMasura().getNume());
        }
    }


    public void afiseazaStoc() {
        for (Map.Entry<Produs, Integer> entry : stocProduse.entrySet()) {
            Produs key = entry.getKey();
            int value = entry.getValue();

            System.out.println(key.getNume() + " - " + value + " " + key.getUnitateDeMasura().getNume());
        }
    }


}