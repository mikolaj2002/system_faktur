package org.example;

public class Kwota {
    private float cenaNetto;
    private int procentVAT;
    private float kwotaPodatku;
    private float cenaBrutto;

    private void obliczKwoty() {
        if (kwotaPodatku != -1)
            kwotaPodatku = Math.round((procentVAT / 100.0f) * cenaNetto * 100.0f) / 100.0f;
        cenaBrutto = cenaNetto + kwotaPodatku;
    }

    Kwota() {}

    Kwota(float cn, int pVAT) {
        cenaNetto = cn;
        procentVAT = pVAT;
        kwotaPodatku = -1;
        obliczKwoty();
    }

    Kwota(float cn, float pod) {
        cenaNetto = cn;
        kwotaPodatku = pod;
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
