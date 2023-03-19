/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cz.itnetwork.palindromy;

import java.util.Scanner;

public class Palindromy {

    public static void main(String[] args) {
        // Zadání vstupu
        System.out.println("Zadej palindrom: ");
        Scanner sc = new Scanner(System.in, "Windows-1250");
        String palindrom = sc.nextLine();
        // Získání řetězce pozpátku
        String pozpatku = "";
        for (int i = palindrom.length() - 1; i >= 0; i--) {
            pozpatku += palindrom.charAt(i);
        }
        // Porovnání
        if (palindrom.equals(pozpatku)) {
            System.out.println("Ano, toto je palindrom.");
        } else {
            System.out.println("Toto není palindrom.");
        }
    }

}