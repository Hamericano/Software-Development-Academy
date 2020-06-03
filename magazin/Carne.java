package com.sda.magazin;

public class Carne extends Perisabile{
    private TipCarne tipCarne;

    public Carne(double pret, String nume, String cod, String detalii, String producator, UnitateDeMasura unitateDeMasura,
                 Date dataExpirare, Date dataFabricatie, TipCarne tipCarne) {
        super(pret, nume, cod, detalii, producator, unitateDeMasura, dataExpirare, dataFabricatie);
        this.tipCarne = tipCarne;
    }

    public TipCarne getTipCarne() {
        return tipCarne;
    }
}
