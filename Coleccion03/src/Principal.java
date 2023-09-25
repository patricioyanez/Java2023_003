import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        
        ArrayList<String> nombres;
        nombres = new ArrayList<String>();
        
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Levi");
        
        System.out.println(nombres.get(2));
        System.out.println(nombres.get(1));
        System.out.println(nombres.get(0));
        
        System.out.println("Cantidad de elementos: " + nombres.size());
        
        nombres.add("Zeke");
        nombres.add("MiKasa");
        
        System.out.println("Cantidad de elementos: " + nombres.size());
        
        ArrayList<Integer> numeros;
        numeros = new ArrayList<Integer>();
        
        System.out.println("Cantidad de numeros: " + numeros.size());
        numeros.add(10);
        numeros.add(10);
        numeros.add(10);
        System.out.println("Cantidad de numeros: " + numeros.size());
        
        for(String nombre: nombres)
        {
            System.out.println("Nombre: " + nombre);
        }
        
        System.out.println("Métodos adicionales");
        
        int indice = nombres.indexOf("Levi");
        
        if(indice>=0)
            System.out.println("Levi Existe, indice: " + indice);
        else
            System.out.println("Levi No Existe");
        
        boolean existe = nombres.contains("Zeke");        
        if(existe)
            System.out.println("Zeke Existe. ");
        else
            System.out.println("Zeke No Existe.");
        
        System.out.println("**** Eliminar elementos *****");
        
        boolean fueEliminado = nombres.remove("Luis");
        if(fueEliminado)
            System.out.println("Luis Eliminado.");
        else
            System.out.println("Luis No Eliminado.");
        
        String nombreEliminado = nombres.remove(2);
        System.out.println("El nombre eliminado es: " + nombreEliminado);
        
        System.out.println("**** Limpiar colección ****");
        System.out.println("Cantidad: " + nombres.size());
        nombres.clear();
        System.out.println("Cantidad: " + nombres.size());
        
        
        
    }
    
}
