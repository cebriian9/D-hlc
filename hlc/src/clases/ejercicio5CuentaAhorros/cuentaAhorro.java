package clases.ejercicio5CuentaAhorros;

public class cuentaAhorro {

    static float tasaInteresAnual = 4;

    private float saldoAhorro;

    public cuentaAhorro() {

    }

    public cuentaAhorro(float saldoAhorro) {
        this.saldoAhorro = saldoAhorro;
    }

    public static float getTasaInteresAnual() {
        return tasaInteresAnual;
    }

    public float getSaldoAhorro() {
        return saldoAhorro;
    }

    public void setSaldoAhorro(float saldoAhorro) {
        this.saldoAhorro = saldoAhorro;
    }

    public void calcularInteresMensual() {

        saldoAhorro += (saldoAhorro + tasaInteresAnual) / 12;

    }

    public static void modificarTasaInteres(float interes) {

        tasaInteresAnual = interes;
    }

    

}
