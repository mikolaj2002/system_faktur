//HIGH COHESION: klasa Kwota odpowiada za liczenie kwot brutto, wysokości podatku

//PURE FABRICATION: klasa Kwota liczy kwoty brutto i wysokość podatku,
//                  bo jest to używane w wielu miejscach w programie

package org.example;

public class Kwota {
    private final float cenaNetto;
    private final float kwotaPodatku;
    private final float cenaBrutto;

    Kwota(float cn, int pVAT) {
        cenaNetto = Math.round(cn * 100.0f) / 100.0f;
        kwotaPodatku = Math.round((pVAT / 100.0f) * cenaNetto * 100.0f) / 100.0f;
        cenaBrutto = Math.round((cenaNetto + kwotaPodatku) * 100.0f) / 100.0f;
    }

    Kwota(float cn, float pod) {
        cenaNetto = Math.round(cn * 100.0f) / 100.0f;
        kwotaPodatku = Math.round(pod * 100.0f) / 100.0f;
        cenaBrutto = Math.round((cenaNetto + kwotaPodatku) * 100.0f) / 100.0f;
    }

    public float getCenaNetto() {
        return cenaNetto;
    }

    public float getKwotaPodatku() {
        return kwotaPodatku;
    }

    public float getCenaBrutto() {
        return cenaBrutto;
    }
}
