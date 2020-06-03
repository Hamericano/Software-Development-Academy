package com.sda.personal;

public class Adresa {
    private String strada;
    private String localitate;
    private int nr;

    public Adresa(String strada, String localitate, int nr) {
        this.strada = strada;
        this.localitate = localitate;
        this.nr = nr;
    }

    public String getStrada() {
        return strada;
    }

    public void setStrada(String strada) {
        this.strada = strada;
    }

    public String getLocalitate() {
        return localitate;
    }

    public void setLocalitate(String localitate) {
        this.localitate = localitate;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }
}
