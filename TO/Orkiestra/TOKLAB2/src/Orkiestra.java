import java.util.ArrayList;
import orkiestra.Flute;
import orkiestra.Guitar;
import orkiestra.Instrument;
import orkiestra.Opera;
import orkiestra.Trombone;

public class Orkiestra {
    public static void main(String[] args) {

        Instrument guitar = new Guitar();
        Instrument flute = new Flute();
        Instrument trombone = new Trombone();
        Opera opera1 = new Opera();
        opera1.addInstruments(new Guitar());
        opera1.addInstruments(new Guitar());

        ArrayList<Instrument> myorkiestra = new ArrayList<>();

        myorkiestra.add(guitar);
        myorkiestra.add(flute);
        myorkiestra.add(trombone);

        for (Instrument i : myorkiestra) {
            i.play();
        }
        System.out.println("Opera plays: ");
        opera1.play();
    }
}
