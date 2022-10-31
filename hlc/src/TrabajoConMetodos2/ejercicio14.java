package TrabajoConMetodos2;

import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Ingrese un numero:");
        int num=sc.nextInt();
        System.out.println("Ingrese un caracter de relleno:");
        String relleno=sc.nextLine();
        relleno=sc.nextLine();

        cuadradoDeAscteriscos(num,relleno);
        sc.close();
    }

    private static void cuadradoDeAscteriscos(int num, String relleno) {

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(relleno);
            }
            System.out.println();
        }
    }
}
