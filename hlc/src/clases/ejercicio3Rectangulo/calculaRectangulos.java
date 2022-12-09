package clases.ejercicio3Rectangulo;

import java.util.Scanner;

public class calculaRectangulos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        rectangulo Rectangulo = new rectangulo();

        float longitud = 0;
        float anchura = 0;


        boolean salir = false;
        while (salir == false) {
            System.out.println("introduce la longitud del rectangulo (1-20)");
            longitud = sc.nextFloat();

            if (Rectangulo.setLongitud(longitud)) {
                System.out.println("la longitud es correcta");
                salir = true;
            } else {
                System.out.println("La longitud no es correcta");
            }

        }

        salir = false;
        while (salir == false) {
            System.out.println("introduce la anchura del rectangulo (1-20)");
            anchura = sc.nextFloat();

            if (Rectangulo.setAnchura(anchura)) {
                System.out.println("la anchura es correcta");
                salir = true;
            } else {
                System.out.println("La anchura no es correcta");
            }

        }

        System.out.println("El perimetro del rectangulo es "+ Rectangulo.perimetro());

        System.out.println("El perimetro del rectangulo es "+ Rectangulo.area());

        sc.close();
    }
}
