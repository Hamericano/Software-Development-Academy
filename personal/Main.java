package com.sda.personal;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alex", 241, "dsa",
                new Adresa("Dsad", "Craiova", 21), Statut.BOBOC);
        System.out.println(student.toString());
        MembruFacultate membruFacultate = new MembruFacultate("Gabriel", 202, "dqd",
                new Adresa("sd", "Craiova", 21), new DataAngajare(12, 2, 2020), 200, 12, "Decan");
        System.out.println(membruFacultate.toString());
    }
}
