//HIGH COHESION: klasa Element odpowiada za przechowywanie informacji o elemencie,
//              jak i liczenie kwot dla elementu

package org.example;

import java.io.IOException;

public class Element {
    protected final Towar towar;
    protected final int ilosc;
    private final Kwota kwota;

    Element() throws IOException {
        System.out.println("\nTowar:");
        //CREATOR: Klasa Element tworzy obiekt klasy Towar, ponieważ tylko ona go wykorzystuje
        towar = new Towar();

        System.out.print("Podaj ilość: ");
        ilosc = Integer.parseInt(TakeInput.reader.readLine());

        //EXPERT: klasa Element liczy cenę elementu
        kwota = new Kwota(ilosc * towar.getCena(), towar.getVAT());
    }

    Element(Towar t, int i) {
        towar = t;
        ilosc = i;
        kwota = new Kwota(ilosc * towar.getCena(), towar.getVAT());
    }

    public Kwota getKwota() { return kwota; }

    void wyswietl(int lp) {
        ShowOutput.pokazElement(lp, this);
    }
}
