package com.sda.magazin;

public class Haine extends Produs {
    private String numeMaterial;

    public Haine(double pret, String nume, String cod, String detalii, String producator, UnitateDeMasura unitateDeMasura, String numeMaterial) {
        super(pret, nume, cod, detalii, producator, unitateDeMasura);
        this.numeMaterial = numeMaterial;
    }

    public String getNumeMaterial() {
        return numeMaterial;
    }
}
