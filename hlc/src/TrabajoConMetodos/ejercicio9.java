import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("introduce un numero:");
        int num=sc.nextInt();

        System.out.println("Introduce un exponente:");
        int exponente=sc.nextInt();

        

        System.out.println("Resultado: "+BaseExponente(num, exponente));

        sc.close();
    }

    private static int BaseExponente(int num, int exponente) {
        for (int i = 0; i < exponente; i++) {
            num*=num;
        }

        return num;
    }

}
