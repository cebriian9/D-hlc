package clases.ejercicio5CuentaAhorros;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ahorros {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        cuentaAhorro ahorrador1 = new cuentaAhorro(2000);
        cuentaAhorro ahorrador2 = new cuentaAhorro(3000);

        System.out.println("Establezca una tasa de interes:");
        System.out.println("actualmente es: " + cuentaAhorro.getTasaInteresAnual());
        System.out.println("introduce una nueva:");
        float interes = sc.nextFloat();
        cuentaAhorro.modificarTasaInteres(interes);

        System.out.println("actualmente es: " + cuentaAhorro.getTasaInteresAnual());

        System.out.println("los saldos acuales son:");
        System.out.println("ahorrador 1: " + df.format(ahorrador1.getSaldoAhorro()));
        System.out.println("ahorrador 2: " + df.format(ahorrador2.getSaldoAhorro()));

        System.out.println("calculando las tasas mensuales:");

        ahorrador1.calcularInteresMensual();
        ahorrador2.calcularInteresMensual();

        System.out.println("los saldos acuales son:");
        System.out.println("ahorrador 1: " + df.format(ahorrador1.getSaldoAhorro()));
        System.out.println("ahorrador 2: " + df.format(ahorrador2.getSaldoAhorro()));

        sc.close();

    }
}
