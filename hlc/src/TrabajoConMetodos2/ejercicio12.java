package TrabajoConMetodos2;

import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Ingrese un numero:");
        int num=sc.nextInt();

        if (esPar(num)) {
            System.out.println("Es par");
        }else{
        System.out.println("es Inpar");
        }
        sc.close();
    }

    private static boolean esPar(int num) {
        boolean par=false;

        if (num%2==0) {
            par=true;
        }

        return par;
    }
}
