package main;

import dokumenty.Faktura;
import druk.DrukowanieZaawansowane;
import druk.WydrukFaktury;
import druk.WydrukFakturyTemplate;
import magazyn.Towar;
import config.Konfiguracja;
import rabaty.AdapterLosowyRabat;
import rabatlosowy.LosowyRabat;

import java.util.Date;

public class Ui {
	public static void main(String[] args) {
		// Ustawienie losowego rabatu w konfiguracji
		Konfiguracja.getInstance().setObliczanieRabatu(new AdapterLosowyRabat(new LosowyRabat()));

		Faktura faktura = new Faktura(new Date(), "Jan Kowalski");
		Towar towar1 = new Towar(3.50, "Mleko");
		Towar towar2 = new Towar(2.80, "Chleb");

		faktura.dodajPozycje(towar1, 2);
		faktura.dodajPozycje(towar2, 3);

		// Tworzenie obiektu drukowania faktury z wykorzystaniem zaawansowanego drukowania
		WydrukFaktury wydruk = new WydrukFaktury(new DrukowanieZaawansowane());
		wydruk.drukujFakture(faktura);
	}
}
