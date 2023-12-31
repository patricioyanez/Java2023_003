
public class Comida {
    private int codigo;
    private String nombre;
    private int precio;
    private int calorias;
    private int sodio;
    public Comida(){
        this.codigo = 0;
        this.nombre = "";
        this.precio = 0;
        this.calorias = 0;
        this.sodio = 0;
    }
    public Comida(int codigo, String nombre, int precio, int calorias, int sodio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.calorias = calorias;
        this.sodio = sodio;
    }

    public int getSodio() {
        return sodio;
    }

    public void setSodio(int sodio) {
        this.sodio = sodio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public String imprimir() {
        return "Comida{" + "codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", calorias=" + calorias + ", sodio=" + sodio + '}';
    }
    
    public String tipoComida()
    {
        return "Esto es comida";
    }
}
