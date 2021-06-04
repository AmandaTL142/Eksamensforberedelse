package Eksamensspørgsmål;

import java.util.ArrayList;

public class ArrayListOpgave {
    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList();
        liste.add("the");
        liste.add("quick");
        liste.add("brown");
        liste.add("fox");

        String con = "";

        for (String word:liste){
            con += word + " ";
        }


        System.out.println(con);

    }
}
