//HIGH COHESION: klasa Towar odpowiada za przechowywanie informacji o towarze i ich pobieranie

package org.example;

import java.io.IOException;

public class Towar {
    private final String nazwa;
    private final float cenaNetto;
    private final int procentVat;

    Towar() throws IOException {
        System.out.print("Podaj nazwę: ");
        nazwa = TakeInput.reader.readLine();

        System.out.print("Podaj cenę netto: ");
        cenaNetto = Float.parseFloat(TakeInput.reader.readLine());

        System.out.print("Podaj procent podatku VAT: ");
        procentVat = Integer.parseInt(TakeInput.reader.readLine());
    }

    Towar(String n, float cn, int pVat) {
        nazwa = n;
        cenaNetto = cn;
        procentVat = pVat;
    }

    public String getNazwa() {
        return nazwa;
    }

    public float getCena() {
        return cenaNetto;
    }

    public int getVAT() {
        return procentVat;
    }
}
