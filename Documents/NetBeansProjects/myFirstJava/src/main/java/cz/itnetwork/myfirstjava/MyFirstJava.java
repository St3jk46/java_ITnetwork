/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cz.itnetwork.myfirstjava;
import java.util.Scanner;
/**
 *
 * @author Václav
 */
public class MyFirstJava {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in, "Windows-1250");
         System.out.println("Ahoj, toto je první program vytvořený mnou.");
         System.out.println("Využil jsem znalosti z první a druhé lekce kurzu JAVA");
         System.out.println("Cílem programu je spojovat řetězce");
         System.out.println("Zadej první část textu");
         String x = sc.nextLine();
         System.out.println("Zadej druhou část textu");
         String y = sc.nextLine();
         System.out.println(x+(" kakadu ")+ y);
         String c = x +(" ") + y;
         System.out.println(c);
        
         
    }
}
