package com.sda.magazin;

public enum UnitateDeMasura {
    BUCATA("BUC"), KILOGRAM("KG");
    private String nume;

        UnitateDeMasura(String nume) {
            this.nume = nume;
        }

        public String getNume() {
            return nume;
        }
}
