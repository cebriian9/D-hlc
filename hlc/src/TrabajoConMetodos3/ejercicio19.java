package TrabajoConMetodos3;

public class ejercicio19 {
    
    public static void main(String[] args) {
        int num=1;
        for (int i = 0; i < 1000; i++) {
            
            Perfecto(num);
        }
    }

    private static void Perfecto(int num) {

        for (int i = 0; i < num; i++) {
            if (factoria(num)) {
                System.out.println(num+" Es perfecto!");
            }
        }
    }

    private static boolean factoria(int num) {
        boolean perfecto=false;
        int total=0;
        for (int i = 1; i < num; i++) {
            total+=i;
        }
        if (total==num) {
            perfecto=true;
        }
        return perfecto;
    }
}
