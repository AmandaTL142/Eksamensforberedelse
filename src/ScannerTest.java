import java.util.Scanner;

public class ScannerTest {
    public static String Navn() {
        System.out.println("Skriv dit navn:");
        Scanner sc = new Scanner(System.in);
        String navn = sc.nextLine();
        return navn;
    }

    public static int Alder() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv din alder:");
        int alder = sc.nextInt();
        return alder;
    }

    public static void main(String[] args) {
        System.out.println(Navn());
        System.out.println(Alder());
    }

}