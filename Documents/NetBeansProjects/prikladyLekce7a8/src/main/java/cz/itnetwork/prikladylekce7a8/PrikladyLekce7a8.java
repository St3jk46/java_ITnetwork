/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cz.itnetwork.prikladylekce7a8;
import java.util.Scanner;

public class PrikladyLekce7a8 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in, "Windows-1250");
        System.out.println("Zadej své jméno:");
        String jmeno = sc.nextLine();
        if ((jmeno.length()>3) && (jmeno.length()<10)){
            System.out.println("Normální jméno.");
        }
        else {
            System.out.println("Máš moc krátké nebo dlouhé jméno!");
        }
            
/**
 * Porovnavac smajliku
 * @author Václav
 */

        Scanner cs = new Scanner (System.in, "Windows-1250");
        System.out.println("Zadej smajlíka:");
        String smajlik = cs.nextLine();
        switch (smajlik) {
            case ":-)":
                System.out.println("Tvůj smajlík je veselý");
            break;
            case ":)":
                System.out.println("Tvůj smajlík je veselý");
            break;
            case ":-(":
                System.out.println("Tvůj smajlík je smutný");
            break;
            case ":(":
                System.out.println("Tvůj smajlík je smutný");
            break;   
            case ":-*":
                System.out.println("Tvůj smajlík je zamilovaný");
            break;
            case ":*":
                System.out.println("Tvůj smajlík je zamilovaný");
            break; 
            case ":-P":
                System.out.println("Tvůj smajlík je s vyplazeným jazykem");
            break;
            case ":P":
                System.out.println("Tvůj smajlík je s vyplazeným jazykem");
            break; 
            default:
                System.out.println("Tvůj smajlík je neznámý");
      

          
    }
}
