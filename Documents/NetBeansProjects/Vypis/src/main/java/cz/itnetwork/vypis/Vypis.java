/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cz.itnetwork.vypis;

/**
 *
 * @author Václav
 */
public class Vypis 
{
 	public static void main(String[] args) {

float a;
a = 56.6F;
System.out.println(a);

System.out.println("Malá násobilka pomocí dvou cyklů:");
for (double j = 0.01; j <= 1; j++) {
    for (double i = 0.001; i <= 1; i++) {
        System.out.print((i * j) + " ");
    }
    System.out.println();
}
	}
}
