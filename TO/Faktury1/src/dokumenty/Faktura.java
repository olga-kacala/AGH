package dokumenty;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import magazyn.Towar;
import rabaty.ObliczCenePoRabacie;
import config.Konfiguracja;


public class Faktura {
	Date dataSprzedazy;
	String kontrahent;
	ArrayList<Pozycja> pozycje;
	double suma;
	ObliczCenePoRabacie obliczanieRabatu;

	public Faktura(Date dataSprzedazy, String kontrahent) {
		this.dataSprzedazy = dataSprzedazy;
		this.kontrahent = kontrahent;
		pozycje = new ArrayList<Pozycja>();
		suma = 0;
		obliczanieRabatu = Konfiguracja.getInstance().getObliczanieRabatu();
	}

	public void dodajPozycje(Towar towar, double ilosc) {
		pozycje.add(new Pozycja(towar, ilosc, obliczanieRabatu));
		this.przeliczSume();
	}

	public double getSuma() {
		return suma;
	}

	public Date getDataSprzedazy() {
		return dataSprzedazy;
	}

	private void przeliczSume() {
		suma = 0;
		for (Pozycja pozycja : pozycje) {
			suma += pozycja.getWartosc();
		}
	}

	public Iterator<Pozycja> getIteratorPozycji() {
		return pozycje.iterator();
	}

	public String getKontrahent() {
		return this.kontrahent;
	}
}
