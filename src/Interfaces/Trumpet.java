package Interfaces;

/*
Write an interface called: ”Playable” with an abstract method called playSound.
Create 3 instrument classes: Guitar, Trumpet & Drums. Each instrument class implements the Playable interface.
All of the instruments overrides the playSound method, and implements their own version of playSound.
Create an object of each instrument, put them in an Arraylist that contains
Playables and play each of their sounds in a sequence.
 */

public class Trumpet implements Playable {
    public void playSound(){
        System.out.println("Toot!");
    }

    //Constructor
    public Trumpet(){
    }
}
