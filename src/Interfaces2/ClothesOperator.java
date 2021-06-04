package Interfaces2;

import java.util.ArrayList;

public class ClothesOperator {

    public static void main(String[] args) {
        ArrayList<Clothes> closet = new ArrayList<>();

        Pants p = new Pants("HogM", "Læder");
        Hat h = new Hat("61", "Fedora");

        closet.add(p);
        closet.add(h);

        for(Clothes clothesPiece:closet){
            System.out.println(clothesPiece.getInfo());
        }
    }
}
