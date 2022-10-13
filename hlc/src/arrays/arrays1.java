package arrays;

import java.util.Scanner;

public class arrays1 {
    static Scanner sc=new Scanner(System.in);
    static boolean[] asientos=new boolean[10];

    
    public static void main(String[] args) {
        vaciarAvion();

        System.out.println("Que tipo de asiento desea? 1 para premium  2 para economica");
        int tipoAsiento=sc.nextInt();

        if (tipoAsiento==1) {
            sentarVIP();
        } else {
            sentarPobre();
        }

    }


    private static void sentarVIP() {
        for (int i = 0; i < asientos.length-5; i++) {
            
            if (asientos[i]==false) {
                asientos[i]=true;
                i=5;
                System.out.println("Tenemos un asiento para usted");
            }else{
                System.out.println("Acepta cambiar a clase economica? 1-si 2-no");
                String confirmacion=sc.nextLine();

                if (confirmacion=="1") {
                    //cambiar de clase
                } else {
                    //mandar a la mierda
                }
            }

        }
    }


    private static void sentarPobre() {
    }


    private static void vaciarAvion() {
        
        for (int i = 0; i < asientos.length; i++) {
            asientos[i]=false;
        }
    }
}
