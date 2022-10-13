package Palabras;

import java.util.Scanner;

public class pruebas {
    public static void main(String[] args) {
        String tabla="a5b1";
        String palabra="b";
        int pal=0;
        int tab=0;

        Scanner sc=new Scanner(System.in);

        System.out.println("intento:");
        palabra=sc.nextLine();
        if (palabra.charAt(pal) == tabla.charAt(tab)) {
            System.out.println("aa");
        }
        sc.close();
    }
}
