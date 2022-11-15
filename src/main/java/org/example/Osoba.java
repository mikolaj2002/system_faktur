package org.example;

public class Osoba {
    private String nazwa;
    private String adres;
    private String NIP;
    private String email;
    private String nr_telefonu;

    Osoba() {}

    Osoba(String n, String a, String nip, String e, String nt) {
        nazwa = n;
        adres = a;
        NIP = nip;
        email = e;
        nr_telefonu = nt;
    }

    void wyswietl() {
        System.out.println(nazwa);
        System.out.println(adres);
        System.out.println("NIP: " + NIP);
        System.out.println("E-mail: " + email);
        System.out.println("Nr telefonu: " + nr_telefonu);
    }
}
