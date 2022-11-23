package TrabajoConMetodos3;

public class ejercicio19 {

    public static void main(String[] args) {

        
        for (int i = 0; i < 1000; i++) {
            
            if (factorial(i)) {
                System.out.println(i + " Es perfecto!");
            }
            
        }
    }


    private static boolean factorial(int num) {
        boolean perfecto = false;
        int total = 0;
        for (int i = 0; i < num; i++) {
            total += i;
            
        }
        if (total == num) {
            perfecto = true;
        }
        return perfecto;
    }
}
