package clases.ejercicio3Rectangulo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class calculaRectangulos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        rectangulo Rectangulo = new rectangulo();

        float longitud = 0;
        boolean salir=false;
        while (salir==false) {
            
            try {
                System.out.println("introduce la longitud del rectangulo (1-20)");
                longitud = sc.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("solo introducir numeros");

            }

            if (Rectangulo.setLongitud(longitud)) {
                System.out.println("la longitud es correcta");
                salir=true;
            }else{
                System.out.println("La longitud no es correcta");
            }

        } 

        sc.close();
    }
}
