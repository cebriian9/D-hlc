package TrabajoConMetodos3;

import java.util.Scanner;

public class ejercicio26 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        do {
            int numero=(int) (Math.random() * (100-1+1)+1);

            System.out.println("Adivina el numero");
            boolean adivinado=false;
            do {
                int respuestaUsu=sc.nextInt();
                if (respuestaUsu<numero) {
                    System.out.println("Demasiado bajo");
                }else if (respuestaUsu>numero) {
                    System.out.println("Demasiado alto");
                }else if(respuestaUsu==numero){
                    adivinado=true;
                    System.out.println("adivinaste!!");
                }
            } while (adivinado==false);

        } while (pedirNumero());
    }

    private static boolean pedirNumero() {
        boolean salir = false;
        System.out.println("Quieres seguir juando? [1-si 2-no]");
        int respuesta = sc.nextInt();

        if (respuesta==1) {
            salir=true;
        }
        return salir;
    }
}
