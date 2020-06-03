package com.sda.magazin;


public class Perisabile extends Produs {
    private Date dataExpirare;
    private Date dataFabricatie;

    public Perisabile(double pret, String nume, String cod, String detalii, String producator, UnitateDeMasura unitateDeMasura, Date dataExpirare, Date dataFabricatie) {
        super(pret, nume, cod, detalii, producator, unitateDeMasura);
        this.dataExpirare = dataExpirare;
        this.dataFabricatie = dataFabricatie;
    }

    public Date getDataExpirare() {
        return dataExpirare;
    }

    public void setDataExpirare(Date dataExpirare) {
        this.dataExpirare = dataExpirare;
    }

    public Date getDataFabricatie() {
        return dataFabricatie;
    }

    public void setDataFabricatie(Date dataFabricatie) {
        this.dataFabricatie = dataFabricatie;
    }
}
