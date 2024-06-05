package dokumenty;

import magazyn.Towar;
import rabaty.ObliczCenePoRabacie;

public class Pozycja {
	private Towar towar;
	private double cena;
	private double ilosc;
	private double wartosc;
	private String nazwa;
	private double rabat;

	public Pozycja(Towar towar, double ilosc, ObliczCenePoRabacie obliczanieRabatu) {
		this.towar = towar;
		this.ilosc = ilosc;
		this.cena = towar.getCena();
		this.nazwa = towar.getNazwa();
		this.rabat = obliczanieRabatu.obliczCenePoRabacie(this.cena);
		this.przeliczWartosc();
	}

	public void setTowar(Towar towar) {
		this.towar = towar;
		this.cena = towar.getCena();
		this.przeliczWartosc();
	}

	public double getIlosc() {
		return ilosc;
	}

	public void setIlosc(double ilosc) {
		this.ilosc = ilosc;
		this.przeliczWartosc();
	}

	public double getCena() {
		return this.cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
		this.przeliczWartosc();
	}

	public String getNazwa() {
		return nazwa;
	}

	public double getWartosc() {
		return wartosc;
	}

	public double getRabat() {
		return rabat;
	}

	private void przeliczWartosc() {
		this.wartosc = this.ilosc * this.rabat;
	}
}
