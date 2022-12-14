package arrays;

import java.util.Scanner;

public class arrays15 {
    static Scanner sc = new Scanner(System.in);
    static boolean[] asientos = new boolean[10];

    public static void main(String[] args) {
        vaciarAvion();
        boolean salir = false;

        while (salir == false) {

            if (comprobarEstado()==true) {
                System.out.println("Lo sentimos el avion ya esta completo");
                salir=true;

            } else {
                System.out.println();
                System.out.println();
                mostrarAvion();
                System.out.println();
                System.out.println("--BIENVENIDO A RAUL AIRLINES--");
                System.out.println("Que tipo de asiento desea? 1 para premium  2 para economica //3 para salir");
                int tipoAsiento = sc.nextInt();

                switch (tipoAsiento) {
                    case 1:
                        sentarVIP();
                        break;
                    case 2:
                        sentarPobre();
                        break;
                    case 3:
                        salir = true;
                        break;

                    default:
                        salir = true;
                        break;
                }
            }

        }
    }

    private static void mostrarAvion() {
        System.out.println("Clase Premium:");
        for (int i = 0; i < asientos.length; i++) {
            System.out.print("/asiento ["+(i+1)+"] esta: "+asientos[i]+"/");
            if (i==4) {
                System.out.println();
                System.out.println("Clase Economica:");
            }
        }
        System.out.println();
    }

    private static void sentarVIP() {
        System.out.println("--Bienvenido a clase Premium--");
        System.out.println("Buscando asientos...");
        Boolean asientoEncontrado = false;

        for (int i = 0; i < asientos.length - 5; i++) {

            if (asientos[i] == false) {
                asientos[i] = true;
                i = 5;
                System.out.println("Tenemos un asiento para usted");
                asientoEncontrado = true;
            }
        }
        if (asientoEncontrado == false) {
            System.out.println("Acepta cambiar a clase economica? 1-si 2-no");
            int confirmacion = sc.nextInt();
            
            if (confirmacion == 1) {
                sentarPobre();
            } else {
                System.out.println("fuera de aqui y SIGUIENTE!!");
            }
        }

    }

    private static void sentarPobre() {
        System.out.println("--Bienvenido a clase Economica--");
        System.out.println("Buscando asientos...");
        Boolean asientoEncontrado = false;

        for (int i = 5; i < asientos.length; i++) {

            if (asientos[i] == false) {
                asientos[i] = true;
                i = asientos.length;
                System.out.println("Tenemos un asiento para usted");
                asientoEncontrado = true;
            }
        }

        if (asientoEncontrado == false) {
            System.out.println("Acepta cambiar a clase Premium? 1-si 2-no");
            int confirmacion = sc.nextInt();
            
            if (confirmacion == 1) {
                sentarPobre();
            } else {
                System.out.println("fuera de aqui y SIGUIENTE!!");
            }
        }
    }

    private static void vaciarAvion() {

        for (int i = 0; i < asientos.length; i++) {
            asientos[i] = false;
        }
    }

    private static boolean comprobarEstado() {
        boolean lleno = true;

        for (int i = 0; i < asientos.length; i++) {
            if (asientos[i] == false) {
                lleno = false;
            }
        }

        return lleno;
    }
}
