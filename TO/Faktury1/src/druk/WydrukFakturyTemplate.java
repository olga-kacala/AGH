package druk;

import dokumenty.Faktura;

public interface WydrukFakturyTemplate {
    void drukujFaktureTemplate(Faktura faktura);
    void drukujNaglowek(Faktura faktura);
    void drukujPozycje(Faktura faktura);
    void drukujStopke(Faktura faktura);
}
