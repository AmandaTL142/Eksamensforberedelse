package Eksamensspørgsmål;

import java.util.ArrayList;
import java.util.Arrays;

public class Airplane {
    String nationality;
    int ID;
    String name;


    //Constructor
    public Airplane(int ID, String name, String nationilty){
        this.ID = ID;
        this.name = name;
        this.nationality = nationilty;

    }

    public static void main(String[] args) {
        Airplane PlaneOne = new Airplane(001, "HCA", "DK");
        Airplane PlaneTwo = new Airplane(002, "Shakespeare", "UK");
        Airplane PlaneThree = new Airplane(003, "Karen Blixen", "DK");
        Airplane PlaneFour = new Airplane(004, "Obama", "USA");

        //Løsning med arrayList:
        ArrayList<Airplane> airport = new ArrayList<>();

        airport.add(PlaneOne);
        airport.add(PlaneTwo);
        airport.add(PlaneThree);
        airport.add(PlaneFour);

        //Her printes lufthavnen for at tjekke arrayListen
        System.out.println(airport);

        int DKCounter = 0;
        for (Airplane airplane : airport){
            if (airplane.nationality.equals("DK")){
                DKCounter++;
            }
        }
        System.out.println("Der er " + DKCounter + " danske fly i lufthavnen.");


        //Løsning med array (opfylder opgavekravet med maks 50 pladser i lufthavnen):

        Airplane[] airport2 = new Airplane[50];

        airport2[0]=PlaneOne;
        airport2[1]=PlaneTwo;
        airport2[2]=PlaneThree;
        airport2[3]=PlaneFour;

        //Her printes lufthavnen for at tjekke arrayet
        System.out.print("{" + airport2[0]);
        for (int i = 1; i < airport2.length; i++) {
            if (airport2[i] != null){
                System.out.print(", " + airport2[i]);
            }
        }
        System.out.println("}");

        //Her printes lufthavnen vha. en anden metode
        System.out.println(Arrays.toString(airport2));

        int DKCounter2 = 0;
        for (Airplane airplane : airport2){
            if (airplane != null){
                if (airplane.nationality.equals("DK")){
                    DKCounter2++;
                }
            }
        }
        System.out.println("Der er " + DKCounter2 + " danske fly i lufthavnen.");


    }

    @Override
    public String toString() {
        return "No. " + ID + "; name: " + name;
    }
}
