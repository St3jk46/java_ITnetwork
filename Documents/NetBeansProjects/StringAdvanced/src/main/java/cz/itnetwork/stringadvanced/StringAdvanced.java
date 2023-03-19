/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cz.itnetwork.stringadvanced;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Václav
 */
public class StringAdvanced {

    public static void main(String[] args) {
        
        String vyuka = "abeceda:\nzačíná na \"A\"";
System.out.print(vyuka.indexOf('A'));
System.out.println("makam".substring(2, 5));

double teplota = 20.4;
String hlaseni = String.format("Aktuální teplota je %s°C.",teplota);


String text = "Text";
System.out.println(text);
System.out.println(text.charAt(2));
        //samohlaskovac a souhlaskovac
        
        Scanner sc = new Scanner (System.in, "Windows-1250" );
        String s = sc.nextLine();
        System.out.println(s);
        s= s.toLowerCase();
        
        
String txt = "KunaNeseNanuk";
String pozpatku = "";
for(int i = txt.length()-1; i>=0; i--)
{
    pozpatku = pozpatku + text.charAt(i);
}

        //System.out.println(s.charAt(2));
        //System.out.println(s.indexOf('v'));
        
        int pocetSamohlasek = 0;
        int pocetSouhlasek = 0;
        
        String samohlasky = "aeiouyáéěíóúůý";
        String souhlasky = "bcčdďfghjklmnprqrřsštťvwxzž";
        
        for (char c : s.toCharArray()) {
            if (samohlasky.contains(String.valueOf(c))) {
                pocetSamohlasek++;
            }
            else if (souhlasky.contains(String.valueOf(c))) {
                pocetSouhlasek++;
                }
                    }   
        System.out.printf("Samohlásek: %d\n", pocetSamohlasek);
        System.out.printf("Souhlásek: %d\n", pocetSouhlasek);
        System.out.printf("Nepísmenných znaků: %d\n", s.length() - (pocetSamohlasek + pocetSouhlasek));

        //ASCII generator  
        
        //inicializacew proiměnných
        String c = "galiusjuliuscesar";
        System.out.printf("Původní zpráva: %s\n", s);
        String zprava = "";
        int posun = 1;
        
        //cyklus projizdejici jednotlive znaky
        for (char d : s.toCharArray()) {
            int i = (int)d;
            i += posun;
            //kontrola preteceni znaku
            if (i > (int)'z'){
                i -= 26;
            }
            char znak = (char)i;
            zprava += znak;
               
        }
        
        
        //vypis
        
        System.out.printf("Zašifrovaná zpráva: %s\n", zprava);
        
        
        
        
        
        
        
        
    }
}
