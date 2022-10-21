import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("introduce un numero:");
        int num=sc.nextInt();

        System.out.println("Introduce un exponente:");
        int exponente=sc.nextInt();

        

        System.out.println("Resultado: "+enteroPotencia(num, exponente));
        System.out.println("Resultado recursivo: "+enteroPotenciaRecursiva(num, exponente));

        sc.close();
    }

    private static int enteroPotencia(int num, int exponente) {
        
        int resultado=num;

        if (exponente>0) {
            for (int i = 1; i < exponente; i++) {
                resultado*=resultado;
            }
        }else{
            resultado=1;
        }

        return resultado;
    }

    private static int enteroPotenciaRecursiva(int num,int exponente) {
        if(exponente==0){
            return 1;
        } else if (exponente<0) {
            return enteroPotenciaRecursiva(num, exponente+1) / num;
        } else {
            return num * enteroPotenciaRecursiva(num, exponente-1);
        }
    }

}
