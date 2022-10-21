import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("introduce un numero: ");
        int num1=sc.nextInt();
        System.out.println("introduce un posible multiplo;");
        int num2=sc.nextInt();

        if (multiplos(num1,num2)) {
            System.out.println("El segundo numero SI es multiplo:");
        }else{
            System.out.println("El segundo numero NO es multiplo");
        }
        sc.close();
    }

    private static boolean multiplos(int num1, int num2) {
        boolean multiplos=false;

        if (num1%num2==0) {
            multiplos=true;
        }

        return multiplos;
    }
}
