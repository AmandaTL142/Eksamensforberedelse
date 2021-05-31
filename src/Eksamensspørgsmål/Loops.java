package Eksamensspørgsmål;

import java.util.ArrayList;
import java.util.Random;

public class Loops {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> eksempel = new ArrayList<>();
        int sum = 0;

        int arrayListSize = 100; //Undgår magic number

        for (int i = 1; i <= arrayListSize; i++){
            int tempNumber = rand.nextInt(((100)+1));
            sum += tempNumber;
            eksempel.add(tempNumber);
        }

        int gennemsnit = sum/arrayListSize;
        System.out.println("Gennemsnit: " + gennemsnit);

        System.out.println(eksempel);
        System.out.println(eksempel.size());

        for (int i = 1; i <=5; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println("");
        }

    }

}