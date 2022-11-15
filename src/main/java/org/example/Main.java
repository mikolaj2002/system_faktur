package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Faktura> faktury = new ArrayList<Faktura>();
        String choice = "";

        while (!choice.equals("0")) {
            System.out.println("SYSTEM DO WYSTAWIANIA FAKTUR");
            System.out.println("0 - wybierz, aby wyłączyć program");
            System.out.println("1 - wybierz, by stworzyć nową fakturę");
            if (faktury.size() > 0) {
                System.out.println("*************************");
                System.out.println("Lista stworzonych faktur:");
                int i = 2;
                for (Faktura f : faktury) {
                    System.out.println(i + " - wybierz, aby otworzyć fakturę " + f.nr_faktury);
                    i++;
                }
            }
            System.out.println("Twój wybór: ");
            choice = TakeInput.reader.readLine();

            if (choice.equals("1"))
                faktury.add(nowaFaktura());

            int numChoice = Integer.parseInt(choice) - 2;
            if (numChoice >= 0 && numChoice - 2 < faktury.size()) {
                faktury.get(numChoice).wyswietl();
            }
        }
    }

    private static Faktura nowaFaktura() throws IOException {
        Faktura f = TakeInput.fakturaInput();

        String choice = "";
        while (!choice.equals("0")) {
            System.out.println("0 - wybierz, by zakończyć tworzenie faktury");
            System.out.println("1 - wybierz, by dodać nowy produkt");
            System.out.println("Twój wybór: ");
            choice = TakeInput.reader.readLine();

            if (choice.equals("1")) {
                f.dodajElement(TakeInput.elementInput());
            }
        }

        return f;
    }
}