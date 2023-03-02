/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cz.itnetwork.doublertroubler;
import java.util.Scanner;
/**
 *
 * @author Václav
 */
public class DoublerTroubler {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadejte číslo ke zdvojnásobení");
        String s = sc.nextLine();
        int a = Integer.parseInt(s);
        a=a*2;
        System.out.println(a);
    }
}
