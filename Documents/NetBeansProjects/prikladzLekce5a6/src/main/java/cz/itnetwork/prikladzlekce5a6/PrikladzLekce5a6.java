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
        
/**
 *
 * Uppercasuje a pridava jedna k veku
 */
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
        
/**
 *
 * Trimuje a porovnava
 */       
        
        Scanner cs = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadejte delší slovo:");
        String prvni = cs.nextLine().trim();
        System.out.println("Zadejte kratší slovo:");
        String druhe = cs.nextLine().trim();
        int delkaprvni = prvni.length();
        int delkadruhe = druhe.length();
        int rozdil = delkaprvni - delkadruhe;
        System.out.println("Slova se liší délkou o " + rozdil + " znaků");
        
/**
 *
 * Thleda string
 */        
        
        Scanner css = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadej řetězec:");
        String retezec = css.nextLine().trim().toLowerCase();
        System.out.println(retezec);
        System.out.println(retezec.contains("itnetwork"));
        
    }
}


