/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cz.itnetwork.calculator;
import java.util.Scanner;
/**
 *
 * @author Václav
 */
public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Vítej, ve skutečné kalkulačce, zvládli jsme to");
        System.out.println("Zadej první číslo:");
        float a = Float.parseFloat(sc.nextLine());
        System.out.println("Zadej druhé číslo");
        float b = Float.parseFloat(sc.nextLine());
        float soucet = a+b;
        float rozdil = a-b;
        float soucin = a*b;
        float podil = a/b;
        System.out.println("Součet: " + soucet);
        System.out.println("Rozdíl: " + rozdil);
        System.out.println("Součin: " + soucin);
        System.out.println("Podíl: " + podil);
        System.out.println("Děkuji za použití kalkulačky, aplikaci ukončíte libovolnou klávesou.");
        System.out.println("Vítejte v kalkulačce");
        String pokracovat = "ano";
        while (pokracovat.equals("ano")){
            System.out.println("Zadejte první číslo:");
            float c = Float.parseFloat(sc.nextLine());
            System.out.println("Zadejte druhé číslo:");
            float d = Float.parseFloat(sc.nextLine());
            System.out.println("Zvolte si operaci:");
            System.out.println("1 - sčítání");
            System.out.println("2 - odčítání");
            System.out.println("3 - násobení");
            System.out.println("4 - dělení");
            int volba = Integer.parseInt(sc.nextLine());
            float vysledek = 0;
            switch (volba) {
                case 1:
                vysledek = c + d;
                break;
                case 2:
                vysledek = c - d;
                break;
                case 3:
                vysledek = c * d;
                break;
                case 4:
                vysledek = c / d;
                break;
                }
                if ((volba > 0) && (volba < 5)) {
                System.out.println("Výsledek: " + vysledek);
                }
                else {
                System.out.println("Neplatná volba");
                }
                System.out.println("Přejete si ztadat další příklad [ano/ne]");
                pokracovat = sc.nextLine();
        }
                System.out.println("Děkuji za použití kalkulačky.");
        }
    }

