/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cz.itnetwork.ascii;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Václav
 */
public class ASCII {

    public static void main(String[] args) {
        System.out.println("ASCII tabulka");
        System.out.println("=============");
        
        
                for (int i = 33; i <= 255; i++) {
                System.out.printf("%d:%c\n", i, i);
        }
    }

    }
