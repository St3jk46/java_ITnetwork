package cz.itnetwork.papousek;
import java.util.Scanner;

public class Papousek {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Ahoj, jsem pták ohnivák, rád opakuji");
        System.out.println("Napiš něco, člověku");
        String vstup = sc.nextLine();
        String vystup;
        vystup = vstup + ", " + vstup + "!";
        System.out.println(vystup);
        int v = -39;
        System.out.println(vystup + v);
        int x = 2;
float y = 50F;
System.out.println(y);

    }
}
