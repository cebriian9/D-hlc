package clases.ejercicio3Rectangulo;

public class rectangulo {
    
    private float longitud=1;
    private float anchura=1;


    public rectangulo() {
        
    }

    public float getLongitud() {
        return longitud;
    }

    public boolean setLongitud(float longitud) {

        boolean correcto=false;
        if (longitud>0 && longitud<=20) {
            this.longitud = longitud;
            correcto=true;
        } 
        return correcto;
        
    }
    
    public float getAnchura() {
        return anchura;
    }

    public boolean setAnchura(float anchura) {
        boolean correcto=false;
        if (anchura>0 && anchura<=20) {
            this.anchura = anchura;
            correcto=true;
        } 
        return correcto;
    }

    @Override
    public String toString() {
        return "El rectangulo tiene [longitud=" + longitud + ", anchura=" + anchura + "]";
    }

    public float area() {
        float resultado=longitud*anchura;
        return resultado;
    }

    public float perimetro() {
        float resultado=(longitud*2)+(anchura*2);
        return resultado;
    }
}
