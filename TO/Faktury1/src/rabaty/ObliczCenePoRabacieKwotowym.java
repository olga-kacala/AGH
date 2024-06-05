package rabaty;

public class ObliczCenePoRabacieKwotowym implements ObliczCenePoRabacie {
    private double kwotaRabatu;

    public ObliczCenePoRabacieKwotowym(double kwotaRabatu) {
        this.kwotaRabatu = kwotaRabatu;
    }

    @Override
    public double obliczCenePoRabacie(double cena) {
        return cena - kwotaRabatu;
    }
}
