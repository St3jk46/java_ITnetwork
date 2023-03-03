/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cz.itnetwork.prikladzlekce5a6;
import java.util.Scanner;
/**
 *
 * @author Václav
 */
public class PrikladzLekce5a6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadej jméno:");
        String jmeno = sc.nextLine();
        System.out.println("Zadej příjmení:");
        String prijmeni = sc.nextLine();
        System.out.println("Zadej svůj věk:");
        String vek = sc.nextLine();
        int a = Integer.parseInt(vek);
        a = a + 1;
        System.out.println(jmeno.toUpperCase()+" "+prijmeni.toUpperCase());
        System.out.println("Za rok ti bude " + a + " let.");
        
    }
}


