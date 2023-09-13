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
        
    }
    
}
