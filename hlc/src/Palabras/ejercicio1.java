package Palabras;

import java.util.Scanner;

public class ejercicio1 {
    static final String tablaPuntos = "q5x9p4";
    static Scanner sc = new Scanner(System.in);
    static int puntosJugador = 0;

    public static void main(String[] args) {

        int puntos = 55;

        do {

            System.out.println("introduce tu intento:");
            String palabra = sc.nextLine();
            palabra = palabra.toLowerCase();

            contarPuntos(palabra);
            System.out.println("puntuaje actual=" + puntosJugador);

        } while (puntos > puntosJugador);
        System.out.println("felicidades llegaste a la meta con: " + puntosJugador + " de puntos");

    }

    private static void contarPuntos(String palabra) {

        int tabla = 0;

        for (int i = tablaPuntos.length() / 2; i < tablaPuntos.length(); i++) {

            for (int j = 0; j < palabra.length(); j++) {

                if (palabra.charAt(j) == tablaPuntos.charAt(tabla)) {

                    puntosJugador = puntosJugador + Character.getNumericValue(tablaPuntos.charAt(tabla + 1));

                }
            }
            tabla += 2;

        }

    }
}
