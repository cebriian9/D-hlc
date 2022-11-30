package TrabajoConMetodos2;

import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Que quiere convertir?");
        System.out.println("1-Celsius 2-Fahrenheit");
        int menu = sc.nextInt();

        switch (menu) {
            case 1:
                System.out.println("Introduce los grados Celsius:");
                int celsius = sc.nextInt();
                pasarAF(celsius);
                break;
            case 2:
                System.out.println("Introduce los grados Fahrenheit:");
                int fahrenheit = sc.nextInt();
                pasarAC(fahrenheit);
                break;

            default:
                break;
        }

        sc.close();

    }

    private static void pasarAC(int fahrenheit) {
        int CE;

        CE=(int) (5.0/9.0*(fahrenheit-32));

        System.out.println("Eso son: "+ CE+" Celsius");
    }

    private static void pasarAF(int celsius) {
        int FA;

        FA=(int) (9.0/5.0*celsius+32);

        System.out.println("Eso son: "+FA+" Fahrenheit");
    }
}
