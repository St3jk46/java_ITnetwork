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
        
        
    }
}
