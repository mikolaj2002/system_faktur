//HIGH COHESION: klasa Faktura odpowiada za przechowywanie informacji o fakturze
//              i wyświetlanie oraz wysyłanie ich

package org.example;

import java.io.IOException;
import java.util.ArrayList;

public class Faktura {
    private final String nrFaktury;
    protected Osoba sprzedawca;
    protected Osoba nabywca;
    protected String data;
    protected final ArrayList<Element> elementy;

    //CREATOR: klasa Faktura tworzy obiekty klasy Osoba, ponieważ są one tylko dla niej potrzebne
    Faktura() throws IOException {
        elementy = new ArrayList<>();

        System.out.print("\nPodaj numer faktury: ");
        nrFaktury = TakeInput.reader.readLine();

        System.out.print("Podaj datę: ");
        data = TakeInput.reader.readLine();

        System.out.println("\nSprzedawca:");
        sprzedawca = new Osoba();

        System.out.println("\nNabywca:");
        nabywca = new Osoba();
    }

    Faktura(String nf, Osoba s, Osoba n, String d) {
        nrFaktury = nf;
        sprzedawca = s;
        nabywca = n;
        data = d;
        elementy = new ArrayList<>();
    }

    public String getNrFaktury() { return nrFaktury; }

    public void dodajElement(Element e) {
        elementy.add(e);
    }

    public void dodajElementZWejscia() throws IOException {
        //CREATOR: klasa Faktura tworzy obiekty Element, ponieważ tylko ona je wykorzystuje
        dodajElement(new Element());
    }

    //EXPERT: klasa Faktura liczy kwotę całej faktury
    public Kwota policzKwoteFaktury() {
        float cenaNetto = 0, kwotaPodatku = 0;
        for (Element e : elementy) {
            cenaNetto += e.getKwota().getCenaNetto();
            kwotaPodatku += e.getKwota().getKwotaPodatku();
        }
        return new Kwota(cenaNetto, kwotaPodatku);
    }

    public void wyswietl() {
        ShowOutput.pokazFaktura(this);
    }
}
