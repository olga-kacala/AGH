package orkiestra;

import java.util.ArrayList;

public class Opera implements Instrument {
    public ArrayList<Instrument> instruments = new ArrayList<>();

    public void addInstruments(Instrument instrument) {
        this.instruments.add(instrument);
    }

    public void play() {
        for (Instrument i : instruments) {
            i.play();
        }
    }
}
