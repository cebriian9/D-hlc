package TrabajoConMetodos2;

import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Ingrese un numero:");
        int num=sc.nextInt();
        
        cuadradoDeAscteriscos(num);
        sc.close();
    }

    private static void cuadradoDeAscteriscos(int num) {

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
