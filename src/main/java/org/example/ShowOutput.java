//PROTECTED VARIATIONS: zmiany w sposobie wyświetlania wymagają zmiany jedynie tej klasy

package org.example;

import java.util.ArrayList;

public class ShowOutput {
    public static void pokazElement(int lp, Element e) {
        System.out.println(lp + ".\t" + e.towar.getNazwa() + "\t" + e.ilosc + "\t"
                + e.getKwota().getCenaNetto() + "\t" + e.towar.getVAT()
                + "\t" + e.getKwota().getCenaBrutto());
    }

    public static void pokazOsoba(Osoba o) {
        System.out.println(o.nazwa);
        System.out.println(o.adres);
        System.out.println("NIP: " + o.NIP);
        System.out.println("E-mail: " + o.email);
        System.out.println("Nr telefonu: " + o.nrTelefonu);
    }

    public static void pokazFaktura(Faktura f) {
        System.out.println("\n-------------------------");
        System.out.println("Data wystawienia: " + f.data);
        System.out.println("Numer faktury: " + f.getNrFaktury());

        System.out.println("\nSprzedawca:");
        f.sprzedawca.wyswietl();

        System.out.println("\nNabywca:");
        f.nabywca.wyswietl();

        System.out.println("\nElementy:");
        System.out.println("Lp.\tNazwa\tIlość\tCena netto\tVAT\tCena brutto");

        for (Element e : f.elementy) {
            e.wyswietl(f.elementy.indexOf(e) + 1);
        }

        Kwota kFaktury = f.policzKwoteFaktury();
        System.out.println("\nŁączna kwota netto: " + kFaktury.getCenaNetto());
        System.out.println("Łączna kwota VAT: " + kFaktury.getKwotaPodatku());
        System.out.println("Łączna kwota brutto: " + kFaktury.getCenaBrutto());
        System.out.println("-------------------------\n");
    }

    public static void pokazMenuGlowne(ArrayList<Faktura> faktury) {
        System.out.println("\nSYSTEM DO WYSTAWIANIA FAKTUR");
        System.out.println("0 - wybierz, aby wyłączyć program");
        System.out.println("1 - wybierz, by stworzyć nową fakturę");
        if (faktury.size() > 0) {
            System.out.println("*************************");
            System.out.println("Lista stworzonych faktur:");
            for (Faktura f : faktury)
                System.out.println("f" + faktury.indexOf(f) + " - wybierz, aby otworzyć fakturę " + f.getNrFaktury());
        }
        System.out.print("Twój wybór: ");
    }

    public static void pokazMenuElementu() {
        System.out.println("\n0 - wybierz, by zakończyć tworzenie faktury");
        System.out.println("1 - wybierz, by dodać nowy produkt");
        System.out.print("Twój wybór: ");
    }
}
