package com.sda.blocul;

public class Main {
    public static void main(String[] args) {

        Bloc bloc = new Bloc("E2");
        Etaj parter = new Etaj(0);
        Apartament apartament1 = new Apartament("Familia Ionescu", 1);
        parter.adaugaApartament(apartament1);
        Apartament apartament2 = new Apartament("Familia Popescu", 2);
        parter.adaugaApartament(apartament2);
        bloc.adaugaEtaj(parter);

        Etaj etajul1 = new Etaj(1);
        Apartament apartament3 = new Apartament("Familia Georgescu", 3);
        etajul1.adaugaApartament(apartament3);
        Apartament apartament4 = new Apartament("Familia Vladimirescu", 4);
        etajul1.adaugaApartament(apartament4);
        Apartament apartament5 = new Apartament("Familia Tutulescu", 5);
        etajul1.adaugaApartament(apartament5);
        bloc.adaugaEtaj(etajul1);
        bloc.afiseazaBloc();
    }
}
