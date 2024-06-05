package druk;

import dokumenty.Faktura;
import dokumenty.Pozycja;

import java.util.Iterator;

public class DrukowanieZaawansowane implements WydrukFakturyTemplate {
    @Override
    public void drukujFaktureTemplate(Faktura faktura) {
        drukujNaglowek(faktura);
        drukujPozycje(faktura);
        drukujStopke(faktura);
    }

    @Override
    public void drukujNaglowek(Faktura faktura) {
        System.out.println("Faktura");
        System.out.println("Data sprzedaży: " + faktura.getDataSprzedazy());
        System.out.println("Kontrahent: " + faktura.getKontrahent());
    }

    @Override
    public void drukujPozycje(Faktura faktura) {
        System.out.println("\nPozycje:");
        Iterator<Pozycja> iterator = faktura.getIteratorPozycji();
        while (iterator.hasNext()) {
            Pozycja pozycja = iterator.next();
            System.out.printf("Towar: %s, Ilość: %.2f, Cena: %.2f, Wartość: %.2f%n",
                    pozycja.getNazwa(), pozycja.getIlosc(), pozycja.getCena(), pozycja.getWartosc());
        }
    }

    @Override
    public void drukujStopke(Faktura faktura) {
        System.out.printf("\nSuma: %.2f%n", faktura.getSuma());
    }
}
