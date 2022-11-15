package org.example;

public class Towar {
    private String nazwa;
    private float cena_netto;
    private int procent_vat;

    Towar() {}

    String getNazwa() {
        return nazwa;
    }

    float getCena() {
        return cena_netto;
    }

    int getVAT() {
        return procent_vat;
    }

    Towar(String n, float c, int p) {
        nazwa = n;
        cena_netto = c;
        procent_vat = p;
    }
}
