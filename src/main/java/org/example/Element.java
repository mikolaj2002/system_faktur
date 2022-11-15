package org.example;

public class Element {
    private Towar towar;
    private int ilosc;
    private Kwota kwota;

    Element() {}

    Element(Towar t, int i) {
        towar = t;
        ilosc = i;
        kwota = new Kwota(towar.getCena() * ilosc, towar.getVAT());
    }

    Towar getTowar() {
        return towar;
    }

    int getIlosc() {
        return ilosc;
    }

    Kwota getKwota() {
        return kwota;
    }

    void wyswietl(int lp) {
        System.out.println(lp + ".\t" + towar.getNazwa() + '\t' + ilosc + '\t'
                + ilosc * towar.getCena() + '\t' + towar.getVAT()
                + '\t' + ilosc * towar.getCena() * (1 + towar.getVAT() / 100.0));
    }
}
