package Eksamensspørgsmål;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerQuestion {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/Eksamensspørgsmål/ScannerFile");

        Scanner sc = new Scanner(file);

        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
}