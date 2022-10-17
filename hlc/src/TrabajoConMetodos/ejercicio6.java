public class ejercicio6 {
    
    static float clientes[]=new float [10];
    public static void main(String[] args) {
        rellenarHoras();
        System.out.println("Bien venido a pagos de parking");

        for (int i = 0; i < clientes.length; i++) {
            calcularPagos(clientes[i]);
            
            System.out.printf(" El cliente: %d Pagara -> %.2f por un total de %.2f horas. \n",(i+1), calcularPagos(clientes[i]), clientes[i]);
        }
    }



    private static void rellenarHoras() {
        for (int i = 0; i < clientes.length; i++) {
            float num=(float) (Math.random()*23+1);
            clientes[i]=num;
            
        }
    }



    private static float calcularPagos(float tiempo) {
        float pagoTotal=0;

        if(tiempo<=2){
            pagoTotal=2;
        }else{
            pagoTotal=2;
            pagoTotal+=(tiempo-3)*0.5;
        }
        

        return pagoTotal;
    }
}
