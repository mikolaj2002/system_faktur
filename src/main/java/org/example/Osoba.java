//HIGH COHESION: klasa Osoba odpowiada za przechowywanie informacji
//              o sprzedawcy/nabywcy i ich wyświetlanie

package org.example;

import java.io.IOException;

public class Osoba {
    protected final String nazwa;
    protected final String adres;
    protected final String NIP;
    protected final String email;
    protected final String nrTelefonu;

    Osoba() throws IOException {
        System.out.print("Podaj nazwę: ");
        nazwa = TakeInput.reader.readLine();

        System.out.print("Podaj adres: ");
        adres = TakeInput.reader.readLine();

        System.out.print("Podaj numer NIP: ");
        NIP = TakeInput.reader.readLine();

        System.out.print("Podaj adres e-mail: ");
        email = TakeInput.reader.readLine();

        System.out.print("Podaj numer telefonu: ");
        nrTelefonu = TakeInput.reader.readLine();
    }

    Osoba(String n, String a, String nip, String e, String nr) {
        nazwa = n;
        adres = a;
        NIP = nip;
        email = e;
        nrTelefonu = nr;
    }

    public void wyswietl() {
        ShowOutput.pokazOsoba(this);
    }
}
