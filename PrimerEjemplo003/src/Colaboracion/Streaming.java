
package Colaboracion;

public class Streaming {
    private Cancion cancion;
    private int segundosReproduccion;

    public Streaming() {
        this.cancion = null; // new Cancion();
        this.segundosReproduccion = 0;
    }
    
    public Streaming(Cancion cancion, int segundosReproduccion) {
        this.cancion = cancion;
        this.segundosReproduccion = segundosReproduccion;
    }

    public int getSegundosReproduccion() {
        return segundosReproduccion;
    }

    public void setSegundosReproduccion(int segundosReproduccion) {
        this.segundosReproduccion = segundosReproduccion;
    }

    public Cancion getCancion() {
        return cancion;
    }

    public void setCancion(Cancion cancion) {
        this.cancion = cancion;
    }

    public String imprimir() {
        return "**** Titulo en reproducción *****\n" + 
                cancion.imprimir()  + 
                "\nsegundos Reproduccion = " + segundosReproduccion;
    }
    // https://www.youtube.com/watch?v=0zWsbZ8aqhw&list=PLk2rufbc0DMq2lsPolk3ZmFSSvmGkUw19
    
    public int segundosRestantes()
    {
        return this.cancion.getDuracion() - this.segundosReproduccion;
    }
}
