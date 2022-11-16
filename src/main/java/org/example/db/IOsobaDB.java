package org.example.db;

import org.example.Osoba;

public interface IOsobaDB {
    public void addSprzedawca(Osoba sprzedawca);
    public void updateSprzedawca(Osoba sprzedawca);
    public Osoba getSprzedawca();
    public void removeSprzedawca();

    public void addNabywca(Osoba nabywca);
    public void updateNabywca(Osoba nabywca);
    public Osoba getNabywca();
    public void removeNabywca();
}
