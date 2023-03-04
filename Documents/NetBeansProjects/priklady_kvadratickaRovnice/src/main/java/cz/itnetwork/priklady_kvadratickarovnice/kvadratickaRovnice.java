package cz.itnetwork.priklady_kvadratickarovnice;

import java.util.Scanner;

/**
 *
 * @author Václav
 */
public class kvadratickaRovnice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadejte postupně koeficienty a,b,c kvadratické rovnice ax^2+bx+c=0 : ");
        double a = Double.parseDouble(sc.nextLine());
        double b = Double.parseDouble(sc.nextLine());
        double c = Double.parseDouble(sc.nextLine());

        if (a != 0) {
            // výpočet diskriminantu
            double d = b * b - 4 * a * c;
            if (d < 0) {
                System.out.println("Neexistuje řešení v oblasti reálných čísel");
            } else if (d == 0) {
                double x = -b / (2 * a);
                System.out.printf("Rovnice má jeden kořen x = %f", x);
            } else {
                double x1 = (-b + Math.sqrt(d)) / (2 * a);
                double x2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.printf("Rovnice má 2 reálné kořeny x1 = %f, x2 = %f", x1, x2);
            }
        } else {
            System.out.println("Není kvadratická rovnice"); // pro zjednodušení se komplexními kořeny nebudeme zabývat        
        }
    }
}
