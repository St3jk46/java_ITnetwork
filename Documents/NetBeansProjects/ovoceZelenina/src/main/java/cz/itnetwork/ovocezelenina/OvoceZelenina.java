/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cz.itnetwork.ovocezelenina;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Václav
 */
public class OvoceZelenina {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        String[] zeleniny = {"zelí", "okurka", "rajče", "paprika", "ředkev", "mrkev", "brokolice"};
        String[] ovoce = {"jablko", "hruška", "pomeranč", "jahoda", "banán", "kiwi", "malina"};
        int slov = 0;
        String pokracovat = "ano";

        while (pokracovat.equals("ano")) {
            System.out.println("Zadej název libovolného ovoce nebo zeleniny: ");
            String slovo = sc.nextLine().trim().toLowerCase();

            // Pozn.: Kód k prohledání pole jsme zde napsali nehezky 2x
            // stejný. V programech se není zvykem opakovat, my však zatím
            // neumíme objekty a metody, proto to zde opomineme.
            boolean nalezenoOvoce = false;
            boolean nalezenaZelenina = false;

            for (String s : ovoce) {
                if (slovo.equals(s)) {
                    System.out.println("Zadal jsi ovoce");
                    nalezenoOvoce = true;
                }
            }

            if (!nalezenoOvoce) {
                for (String s : zeleniny) {
                    if (slovo.equals(s)) {
                        System.out.println("Zadal jsi zeleninu");
                        nalezenaZelenina = true;
                    }
                }
            }

            if (!nalezenoOvoce && !nalezenaZelenina) {
                System.out.println("Tvoje slovo nemám v seznamu");
            }

            slov++;
            System.out.println("Přeješ si zadat další slovo? (ano/ne)");
            pokracovat = sc.nextLine().trim().toLowerCase();
        }

        System.out.printf("Zadal jsi %d slov", slov);
    }
}

       
    

