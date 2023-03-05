/* 
 *   _____ _______         _                      _
 *  |_   _|__   __|       | |                    | |
 *    | |    | |_ __   ___| |___      _____  _ __| | __  ___ ____
 *    | |    | | '_ \ / _ \ __\ \ /\ / / _ \| '__| |/ / / __|_  /
 *   _| |_   | | | | |  __/ |_ \ V  V / (_) | |  |   < | (__ / /
 *  |_____|  |_|_| |_|\___|\__| \_/\_/ \___/|_|  |_|\_(_)___/___|
 *                                 _
 *               ___ ___ ___ _____|_|_ _ _____
 *              | . |  _| -_|     | | | |     |  LICENCE
 *              |  _|_| |___|_|_|_|_|___|_|_|_|
 *              |_|
 * 
 *  IT ZPRAVODAJSTVÍ  <>  PROGRAMOVÁNÍ  <>  HW A SW  <>  KOMUNITA
 * 
 *  Tento zdrojový kód je součástí výukových seriálů na
 *  IT sociální síti WWW.ITNETWORK.CZ
 * 
 *  Kód spadá pod licenci prémiového obsahu a vznikl díky podpoře
 *  našich členů. Je určen pouze pro osobní užití a nesmí být šířen.
 *  Více informací na http://www.itnetwork.cz/licence
 */
package cz.itnetwork.intervaly;

import java.util.Scanner;

public class Intervaly {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadejte levou mez 1. intervalu: ");
        int levaMez1 = Integer.parseInt(sc.nextLine());
        System.out.println("Zadejte pravou mez 1. intervalu: ");
        int pravaMez1 = Integer.parseInt(sc.nextLine());
        System.out.println("Zadejte levou mez 2. intervalu: ");
        int levaMez2 = Integer.parseInt(sc.nextLine());
        System.out.println("Zadejte pravou mez 2. intervalu: ");
        int pravaMez2 = Integer.parseInt(sc.nextLine());

        System.out.println("Dvojice čísel, jejichž součet leží v některém z intervalů:");
        System.out.println("(1. číslo je z prvního intervalu a 2. z druhého intervalu)");
        int soucet;
        for (int i = levaMez1; i <= pravaMez1; i++) {
            for (int j = levaMez2; j <= pravaMez2; j++) {
                soucet = i + j;
                if (((soucet <= pravaMez2) && (soucet >= levaMez2)) || ((soucet <= pravaMez1) && (soucet >= levaMez1))) {
                    System.out.printf("[%d;%d], ", i, j);
                }
            }
        }
    }
}
