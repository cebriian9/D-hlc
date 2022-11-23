package TrabajoConMetodos3;

public class ejercicio22 {
    public static void main(String[] args) {
        int cara = 0;
        int cruz = 0;
        for (int i = 0; i < 1000; i++) {
            if (tirar()) {
                cruz++;
            } else {
                cara++;
            }
        }

        System.out.println("cara salio: " + cara);
        System.out.println("Cruz salio: " + cruz);
    }

    private static boolean tirar() {
        boolean moneda = false; // false cara, true cruz

        int aleatorio = (int) (Math.random() * 2);
        if (aleatorio == 0) {
            moneda = true;
        }
        
        return moneda;
    }
}
