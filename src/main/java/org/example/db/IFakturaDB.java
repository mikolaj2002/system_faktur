package org.example.db;

import org.example.Faktura;

public interface IFakturaDB {
    public void add(Faktura faktura);
    public void update(Faktura faktura);
    public Faktura get();
    public void remove();
}
