package config;

import rabaty.AdapterLosowyRabat;
import rabaty.ObliczCenePoRabacie;
import rabatlosowy.LosowyRabat;

public class Konfiguracja {
    private static Konfiguracja instance;
    private ObliczCenePoRabacie obliczanieRabatu;

    private Konfiguracja() {
        // Ustawienie domyślnej metody obliczania rabatu
        this.obliczanieRabatu = new AdapterLosowyRabat(new LosowyRabat());
    }

    public static Konfiguracja getInstance() {
        if (instance == null) {
            instance = new Konfiguracja();
        }
        return instance;
    }

    public void setObliczanieRabatu(ObliczCenePoRabacie obliczanieRabatu) {
        this.obliczanieRabatu = obliczanieRabatu;
    }

    public ObliczCenePoRabacie getObliczanieRabatu() {
        return obliczanieRabatu;
    }
}
