package org.example.db;

import org.example.Towar;

public interface ITowarDB {
    public void add(Towar towar);
    public void update(Towar towar);
    public Towar get();
    public void remove();
}
