
public class Pizza {
    // 1. Atributos
    private String nombre;
    private String tamano;
    private String masa;
    private int precio;
    
    // 2.- Constructor
    public Pizza()
    {
        nombre = "";
        tamano = "Individual";
        masa = "";
        precio = 0;
    }
    public Pizza(String nombre, String tamano, String masa, int precio)
    {
        this.nombre = nombre;
        this.tamano = tamano;
        this.masa = masa;
        this.precio = precio;
    }
    // 3.- getter and setter (accesador y mutador)
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public String getNombre()
    {
        return this.nombre;
    }
    
    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    // 4.- Métodos personalizados (customer)
    
    public void preparar()
    {
        // sout + tab
        System.out.println("La pizza se está preparando...");
    }
}
