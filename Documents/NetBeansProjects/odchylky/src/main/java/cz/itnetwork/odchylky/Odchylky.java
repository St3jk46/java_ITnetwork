/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cz.itnetwork.odchylky;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Václav
 */
public class Odchylky {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        // Odchylka od mediánu
        System.out.println("Zadej počet čísel: ");
        int pocet = Integer.parseInt(sc.nextLine());
        int[] cisla = new int[pocet];
        for (int i = 0; i < pocet; i++) {
            System.out.printf("Zadej %d. číslo:%n", i + 1);
            cisla[i] = Integer.parseInt(sc.nextLine());
        }
        // Zjednodušený medián
        int[] cisla2 = new int[cisla.length];
        for (int i = 0; i < cisla.length; i++) {
            cisla2[i] = cisla[i];
        }
        Arrays.sort(cisla2);
        float median = cisla2[cisla2.length / 2];
        for (int i : cisla) {
            System.out.printf("%d se od mediánu odchyluje o %f \n", i, i - median);
        }
    }
}
