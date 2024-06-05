package druk;

import dokumenty.Faktura;
import dokumenty.Pozycja;

import java.util.Iterator;

public class DrukowaniePodstawowe implements WydrukFakturyTemplate {
    @Override
    public void drukujFaktureTemplate(Faktura faktura) {
        drukujNaglowek(faktura);
        drukujPozycje(faktura);
        drukujStopke(faktura);
    }

    @Override
    public void drukujNaglowek(Faktura faktura) {
        System.out.println("Nagłówek faktury:");
        System.out.println("Data sprzedaży: " + faktura.getDataSprzedazy());
        System.out.println("Kontrahent: " + faktura.getKontrahent());
    }

    @Override
    public void drukujPozycje(Faktura faktura) {
        System.out.println("\nPozycje:");
        for (Iterator<Pozycja> it = faktura.getIteratorPozycji(); it.hasNext(); ) {
            Pozycja pozycja = it.next();
            System.out.printf("Towar: %s, Ilość: %.2f, Cena: %.2f, Wartość: %.2f%n",
                    pozycja.getNazwa(), pozycja.getIlosc(), pozycja.getCena(), pozycja.getWartosc());
        }
    }

    @Override
    public void drukujStopke(Faktura faktura) {
        System.out.println("\nSuma: " + faktura.getSuma());
    }
}
