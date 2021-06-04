package Eksamensspørgsmål;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerQuestion {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/Eksamensspørgsmål/ScannerFile");

        Scanner sc = new Scanner(file);

        //Oprindeligt havde jeg tallene på hver deres linje i filen, og så brugte jeg nextLine i stedet for nextInt.
        while(sc.hasNextInt()){
            System.out.println(sc.nextInt());
        }
    }
}