package org.example;

import java.util.ArrayList;

public class Faktura {
    public String nr_faktury;
    private Osoba sprzedawca;
    private Osoba nabywca;
    private String data;
    private ArrayList<Element> elementy;

    Faktura() {
        elementy = new ArrayList<Element>();
    }

    Faktura(String nf, Osoba s, Osoba n, String d) {
        elementy = new ArrayList<Element>();
        nr_faktury = nf;
        sprzedawca = s;
        nabywca = n;
        data = d;
    }

    public void dodajElement(Element e) {
        elementy.add(e);
    }

    public Kwota policzKwoteFaktury() {
        float cenaNetto = 0, kwotaPodatku = 0;
        for (Element e : elementy) {
            cenaNetto += e.getKwota().getCenaNetto();
            kwotaPodatku += e.getKwota().getKwotaPodatku();
        }
        return new Kwota(cenaNetto, kwotaPodatku);
    }

    void wyswietl() {
        System.out.println("\n-------------------------");
        System.out.println("Data wystawienia: " + data);
        System.out.println("Numer faktury: " + nr_faktury);

        System.out.println("\nSprzedawca:");
        sprzedawca.wyswietl();

        System.out.println("\nNabywca:");
        nabywca.wyswietl();

        System.out.println("\nElementy:");
        System.out.println("Lp.\tNazwa\tIlość\tCena netto\tVAT\tCena brutto");

        for (Element e : elementy) {
            e.wyswietl(elementy.indexOf(e) + 1);
        }

        Kwota kFaktury = policzKwoteFaktury();
        System.out.println("\nŁączna kwota netto: " + kFaktury.getCenaNetto());
        System.out.println("Łączna kwota VAT: " + kFaktury.getKwotaPodatku());
        System.out.println("Łączna kwota brutto: " + kFaktury.getCenaBrutto());
        System.out.println("-------------------------\n");
    }
}
