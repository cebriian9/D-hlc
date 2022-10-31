package TrabajoConMetodos2;

import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Ingrese el radio de un circulo:");
        float radio=sc.nextFloat();

        calcularRadio(radio);

        sc.close();
    }

    private static void calcularRadio(float radio) {
        float area=0;

        area=(float) (Math.PI*Math.pow(radio, 2));

        System.out.printf("El area del circulo es %.2f",area);
    }
}
