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
            float horas=(int) (Math.random()*23+1);
            float minutos=(int) (Math.random()*59+1);
            minutos=minutos/100;
            horas+=minutos;

            clientes[i]=horas;
            
        }
    }



    private static float calcularPagos(float tiempo) {
        float pagoTotal=2;

        tiempo=(int) (tiempo);
        tiempo++;

        if (tiempo>3) {
            pagoTotal+=(tiempo-3)*0.5;
        }if (pagoTotal>10) {
            pagoTotal=10;            
        }
        
        return pagoTotal;
    }
}
