package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElementTest {
    @Test
    public void testElementKwota()
    {
        Towar towar = new Towar("t1", 3.33f, 23);
        Element elementTest = new Element(towar, 13);

        assertEquals(43.29f, elementTest.getKwota().getCenaNetto());
        assertEquals(9.96f, elementTest.getKwota().getKwotaPodatku());
        assertEquals(53.25f, elementTest.getKwota().getCenaBrutto());
    }
}
