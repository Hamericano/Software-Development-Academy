package com.sda.comparable;

public class Person implements Comparable<Person>{
    private String nume;
    private int varsta;

    public Person(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }


    @Override
    public String compareTo(Person person) {
        if(person.getVarsta() > this.varsta)
            return person.getNume() + " este mai mare.";
        else if(person.getVarsta() < this.varsta)
            return person.getNume() + " este mai mic(a)." ;
        else
            return "Au aceeasi varsta.";
    }
}
