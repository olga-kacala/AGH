package rabaty;

import rabatlosowy.LosowyRabat;

public class AdapterLosowyRabat implements ObliczCenePoRabacie {
    private LosowyRabat losowyRabat;

    public AdapterLosowyRabat(LosowyRabat losowyRabat) {
        this.losowyRabat = losowyRabat;
    }

    @Override
    public double obliczCenePoRabacie(double cena) {
        double rabat = losowyRabat.losujRabat();
        return cena * (1 - rabat);
    }
}
