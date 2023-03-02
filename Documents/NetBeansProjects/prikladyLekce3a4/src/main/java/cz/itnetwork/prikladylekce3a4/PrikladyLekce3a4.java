/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cz.itnetwork.prikladylekce3a4;
import java.util.Scanner;
/**
 *
 * @author Václav
 */
public class PrikladyLekce3a4 {

    public static void main(String[] args) {
        /**
 *
 * Slucuje vstupA a vstup B a vytvari vetu.
 */
                
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Ahoj, jak se jmenuješ?");
        String jmeno = sc.nextLine();
        System.out.println("Jaký jsi?");
        String vlastnost = sc.nextLine();
        String vystup;
        vystup = jmeno + " je " + vlastnost;
        System.out.println(vystup);
        
        
                /**
 *
 * Druha mocnina z vstupu
 */
                
        Scanner cs = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadej číslo k umocnění:");
        String cislo = cs.nextLine();
        int a = Integer.parseInt(cislo);
        a = a * a;
        System.out.println("Výsledek:" + a);
        
        
                        /**
 *
 * Polomer kruhu
 */
                
        Scanner ccs = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadej poloměr kruhu (cm):");
        float polomer = Float.parseFloat(ccs.nextLine());
        float pi;
        pi = 3.1415F;
        float vypocetObvod = 2*pi*polomer;
        System.out.println(vypocetObvod + "cm");
        float vypocetObsah = pi*(polomer*polomer);
        System.out.println("Jeho obsah je " + vypocetObsah + " cm^2");

        }
}   
      
 
