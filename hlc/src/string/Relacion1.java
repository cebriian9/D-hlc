package string;

import java.util.Scanner;

public class Relacion1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int menu = 5;

        switch (menu) {
            case 3:
                ej3();
                break;
            case 4:
                ej4();
                break;
            case 5:
                ej5();
                break;
            case 6:
                eje6();
                break;

            default:
                break;
        }

    }

    private static void eje6() {
        System.out.println("introduce un texto:");
        // 2 array uno con abcd y otro con los tal
    }

    private static void ej5() {
        System.out.println("introduce una cadena:");
        String cad = sc.nextLine();
        System.out.println("y ahora un caracter de busqueda:");
        String caracter=sc.nextLine();

        int cont = 0;

        while (cad.indexOf(caracter)>=0) {
        
            cad = cad.substring(0,cad.indexOf(caracter)) + cad.substring(cad.indexOf(caracter)+1);
            cont++;
        }
        System.out.println("hay " + cont);
        
    }

    private static void ej4() {
        System.out.println("mete cadena:");
        String cad1 = sc.nextLine();

        System.out.println(cad1.toLowerCase());
        System.out.println(cad1.toUpperCase());
    }

    private static void ej3() {
        System.out.println("introduce 2 cadenas:");
        String cad1 = sc.nextLine();
        String cad2 = sc.nextLine();

        System.out.println("comparamos");

        if (cad1.compareTo(cad2) < 0) {
            System.out.println("cadena 2 mas larga");
        }
        if (cad1.compareTo(cad2) > 0) {
            System.out.println("cadena 1 mas largo");
        } else {
            System.out.println("son iguales");
        }
    }
}
