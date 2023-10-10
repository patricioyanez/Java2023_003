
public class Saludable extends Comida {
    private boolean esOrigenNatural;
    
    public Saludable()
    {
        this.esOrigenNatural = false;
    }
    public Saludable(boolean esOrigenNatural, int codigo, String nombre, int precio, int calorias, int sodio) {
        super(codigo, nombre, precio, calorias, sodio);
        this.esOrigenNatural = esOrigenNatural;
    }

    public boolean isEsOrigenNatural() {
        return esOrigenNatural;
    }

    public void setEsOrigenNatural(boolean esOrigenNatural) {
        this.esOrigenNatural = esOrigenNatural;
    }

    public String imprimir() {
        return  " *** Comida Saludable ***" +
               "\nCodigo            : " + getCodigo() + 
               "\nNombre            : " + getNombre() + 
               "\nPrecio            : " + getPrecio()+ 
               "\nCalorias          : " + getCalorias()+ 
               "\nSodio             : " + getSodio()+                
               "\nEs Origen Natural : " + (esOrigenNatural?"Si":"No" );
    }
    
// sobre escritura: cambiar la funcionalidad original
    // del método heredado

    @Override // NOTACIÓN
    public String tipoComida() {
        return "Esta comida es saludable";
    }

    @Override
    public String toString() {
        return "Saludable{" + "esOrigenNatural=" + esOrigenNatural + '}';
    }

// sobre carga
    public String cocinar()
    {
        return "Cocinar 15 minutos.";
    }
    
    public String cocinar(int minutos)
    {
        return "Cocinar " + minutos + " minutos.";
    }
    
    public String cocinar(int minutos, String tipoCoccion)
    {
        return "Cocinar " + minutos + " minutos." + 
                " Tipo Cocción: " + tipoCoccion;
    }
    
    
}
