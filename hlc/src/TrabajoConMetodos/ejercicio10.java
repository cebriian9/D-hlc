import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce el cateo A:");
        double cateoA=sc.nextDouble();
        System.out.println("Introduce el cateto B:");
        double catetoB=sc.nextDouble();

        System.out.printf("La longitud de la hipotenusa es: %.2f ",calcularHipotenusa(cateoA,catetoB));
    }

    private static double calcularHipotenusa(double cateoA, double catetoB) {
        double hipotenusa;
        
        hipotenusa=Math.sqrt(((Math.pow(cateoA, 2))+Math.pow(catetoB, 2)));
        
        return hipotenusa;
    }

    
}
