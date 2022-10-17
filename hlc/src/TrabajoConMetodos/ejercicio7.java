public class ejercicio7 {
    static double numeros []=new double [10];
    public static void main(String[] args) {
        
        rellenarNum();

        for (int i = 0; i < numeros.length; i++) {
            int num=(int) Math.floor(numeros[i]+0.5);

            System.out.println("Numero original: "+numeros[i]);
            System.out.println("Numero redondeado: "+num);
        }

    }

    private static void rellenarNum() {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=Math.random()*100+1;
            
            
        }
    }
}
