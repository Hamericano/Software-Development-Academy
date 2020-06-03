package com.sda.magazin;

public class Fructe extends Perisabile {
    private String taraOrigine;

    public Fructe(double pret, String nume, String cod, String detalii, String producator, UnitateDeMasura unitateDeMasura,
                  Date dataExpirare, Date dataFabricatie, String taraOrigine) {
        super(pret, nume, cod, detalii, producator, unitateDeMasura, dataExpirare, dataFabricatie);
        this.taraOrigine = taraOrigine;
    }

    public String getTaraOrigine() {
        return taraOrigine;
    }
}
