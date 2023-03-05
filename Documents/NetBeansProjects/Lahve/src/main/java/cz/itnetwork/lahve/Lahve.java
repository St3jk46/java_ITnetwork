/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cz.itnetwork.lahve;

/**
 *
 * @author Václav
 */
public class Lahve {

    public static void main(String[] args) {
        String ych = ("zelených láhví stojí na stole a jedna láhev spadne");
        String ene = ("zelené láhve stojí na stole a jedna láhev spadne");
    for (int i = 10; i >= 5; i--) {
    System.out.println(i+" "+ych);
}    
    for (int i = 4; i >= 2; i--) {
    System.out.println(i+" "+ene);
} 
    for (int i = 1; i >= 1; i--) {
    System.out.println(i+ " zelená láhev stojí na stole a jedna láhev spadne");
} 
    

        for (int i = 10; i > 0; i--) {
            String tvar = "zelených láhví";
            if ((i > 1) && (i < 5)) {
                tvar = "zelené láhve";
            }
            if (i == 1) {
                tvar = "zelená láhev";
            }
            System.out.println(i + " " + tvar + " stojí na stole a jedna láhev spadne");

        }
    }
}
           
    
  
