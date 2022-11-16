package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FakturaTest {
    @Test
    public void testFakturaKwota()
    {
        Osoba sprzedawca = new Osoba("", "", "", "", "");
        Osoba nabywca = new Osoba("", "", "", "", "");

        Towar t1 = new Towar("t1", 10.49f, 23);
        Element e1 = new Element(t1, 10);

        Towar t2 = new Towar("t2", 1.19f, 8);
        Element e2 = new Element(t2, 2);

        Faktura fakturaTest = new Faktura("", sprzedawca, nabywca, "");

        fakturaTest.dodajElement(e1);
        fakturaTest.dodajElement(e2);

        assertEquals(107.28f, fakturaTest.policzKwoteFaktury().getCenaNetto());
        assertEquals(24.32f, fakturaTest.policzKwoteFaktury().getKwotaPodatku());
        assertEquals(131.60f, fakturaTest.policzKwoteFaktury().getCenaBrutto());
    }
}
