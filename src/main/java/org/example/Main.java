//LOW COUPLING: wszystkie połączenia między klasami są niezbędne do działania programu
//              i nie da się pomniejszyć ilości tych połączeń bez starty czytelności kodu

//HIGH COHESION: klasa Main odpowiada za obsługę menu (rozmowy z użytkownikiem)

package org.example;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        final ArrayList<Faktura> faktury = new ArrayList<>();
        String choice = "";

        while (!choice.equals("0")) {
            ShowOutput.pokazMenuGlowne(faktury);

            try { choice = TakeInput.reader.readLine(); }
            catch (final IOException ex) {
                System.err.println(ex.getMessage());
            }

            //CREATOR: klasa Main tworzy obiekty Faktura, ponieważ wykorzystuje je do wyświetlania
            if (choice.equals("1")) {
                try { faktury.add(nowaFaktura()); }
                catch (final IOException ex) {
                    System.err.println(ex.getMessage());
                }
            }

            if (choice.length() > 1) {
                int numerFaktury = Integer.parseInt(choice.substring(1));
                if (numerFaktury >= 0 && numerFaktury < faktury.size()) {
                    faktury.get(numerFaktury).wyswietl();
                }
            }
        }
    }

    private static Faktura nowaFaktura() throws IOException {
        Faktura f = new Faktura();

        String choice = "";
        while (!choice.equals("0")) {
            ShowOutput.pokazMenuElementu();

            choice = TakeInput.reader.readLine();

            if (choice.equals("1"))
                f.dodajElementZWejscia();
        }

        return f;
    }
}