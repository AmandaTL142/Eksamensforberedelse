package Interfaces;
import java.util.ArrayList;

public class Instruments {

    public static void main(String[] args) {
        ArrayList<Playable> instruments = new ArrayList<>();

        Guitar g = new Guitar();

        Trumpet t = new Trumpet();

        Drums d = new Drums();

        instruments.add(g);
        instruments.add(t);
        instruments.add(d);

        for (Playable instrument:instruments){
            instrument.playSound();
        }


    }




}
