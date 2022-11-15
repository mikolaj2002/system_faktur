package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TakeInput {

    public static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static Faktura fakturaInput() throws IOException {
        System.out.print("Podaj numer faktury: ");
        String nf = reader.readLine();

        System.out.print("Podaj datę: ");
        String d = reader.readLine();

        System.out.println("Sprzedawca:");
        Osoba s = osobaInput();
        System.out.println("Nabywca:");
        Osoba n = osobaInput();

        return new Faktura(nf, s, n, d);
    }

    public static Osoba osobaInput() throws IOException {
        System.out.print("Podaj nazwę: ");
        String n = reader.readLine();

        System.out.print("Podaj adres: ");
        String a = reader.readLine();

        System.out.print("Podaj numer NIP: ");
        String nip = reader.readLine();

        System.out.print("Podaj adres e-mail: ");
        String e = reader.readLine();

        System.out.print("Podaj numer telefonu: ");
        String nt = reader.readLine();

        return new Osoba(n, a, nip, e, nt);
    }

    public static Element elementInput() throws IOException{
        System.out.println("Towar:");
        Towar t = TakeInput.towarInput();

        System.out.print("Podaj ilość: ");
        String i = reader.readLine();

        return new Element(t, Integer.parseInt(i));
    }

    public static Towar towarInput() throws IOException {
        System.out.print("Podaj nazwę: ");
        String n = reader.readLine();

        System.out.print("Podaj cenę netto: ");
        String c = reader.readLine();

        System.out.print("Podaj procent podatku VAT: ");
        String vat = reader.readLine();

        return new Towar(n, Float.parseFloat(c), Integer.parseInt(vat));
    }
}
