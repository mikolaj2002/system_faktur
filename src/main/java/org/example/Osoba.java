//HIGH COHESION: klasa Osoba odpowiada za przechowywanie informacji
//              o sprzedawcy/nabywcy i ich wyświetlanie

package org.example;

import java.io.IOException;

public class Osoba {
    final String nazwa;
    final String adres;
    final String NIP;
    final String email;
    final String nrTelefonu;

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

    public void wyswietl() {
        ShowOutput.pokazOsoba(this);
    }
}
