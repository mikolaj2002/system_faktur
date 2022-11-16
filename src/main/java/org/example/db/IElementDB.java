package org.example.db;

import org.example.Element;

public interface IElementDB {
    public void add(Element element);
    public void update(Element element);
    public Element get();
    public void remove();
}
