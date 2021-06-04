package Interfaces;
import java.util.ArrayList;

/*
Write an interface called: ”Playable” with an abstract method called playSound.
Create 3 instrument classes: Guitar, Trumpet & Drums. Each instrument class implements the Playable interface.
All of the instruments overrides the playSound method, and implements their own version of playSound.
Create an object of each instrument, put them in an Arraylist that contains
Playables and play each of their sounds in a sequence.
 */

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