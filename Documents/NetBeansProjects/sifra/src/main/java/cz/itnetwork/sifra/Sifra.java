/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cz.itnetwork.sifra;

import java.util.Scanner;

public class Sifra {

    public static void main(String[] args) {
        // Zadání vstupu
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadejte text k zašifrování: ");
        String vstup = sc.nextLine();
        System.out.println("Zadejte heslo: ");
        String heslo = sc.nextLine();
        // Pomocné proměnné
        String vystup = "";
        int poziceA = (int) 'a';
        int poziceZ = (int) 'z';
        // Iterace všemi znaky
        for (int i = 0; i < vstup.length(); i++) {
            /* Výpočet posunu v abecedě podle hesla
               % je zbytek po celočíselném dělení a je 
               zde využito pro jednoduché opakování 
               hesla ve slově */
            int x = (int) heslo.charAt(i % heslo.length()) - (poziceA - 1);
            // Ošetření přetečení přes Z
            if ((int) vstup.charAt(i) + x > poziceZ) {
                x -= poziceZ - poziceA + 1;
            }
            // Získání znaku výstupu
            char znak = (char) ((int) vstup.charAt(i) + x);
            // Přidání znaku do výstupu
            vystup += znak;
        }
        System.out.println(vystup);
    }

}
