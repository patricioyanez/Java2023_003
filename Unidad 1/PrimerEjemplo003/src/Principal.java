// Comentario de una linea

/*
    Comentario de más de una línea
*/
public class Principal {
    
    public static void main(String args[])
    {
        // entry point
        System.out.println("Hola Mundo!!!");
        
        Pizza pizza1;
        pizza1 = new Pizza();
        
        Pizza pizza2 = new Pizza("Española", "Mediana", "delgada", 8000);
        
        System.out.println("Tamaño pizza 1: " + pizza1.getTamano());
        System.out.println("Tamaño pizza 2: " + pizza2.getTamano());
        
        pizza1.setTamano("Familiar");
        System.out.println("Tamaño pizza 1: " + pizza1.getTamano());
        
        System.out.println("\n******* Pizza 2 *******");
        System.out.println("Nombre      : " + pizza2.getNombre());
        System.out.println("Tamaño      : " + pizza2.getTamano());
        System.out.println("Masa        : " + pizza2.getMasa());
        System.out.println("Precio      : " + pizza2.getPrecio());
        
        pizza1.setNombre("Napolitana");
        pizza1.setTamano("Super Familiar");
        pizza1.setMasa("Gruesa");
        pizza1.setPrecio(20000);
        
        System.out.println("\n******* Pizza 1 *******");
        System.out.println("Nombre      : " + pizza1.getNombre());
        System.out.println("Tamaño      : " + pizza1.getTamano());
        System.out.println("Masa        : " + pizza1.getMasa());
        System.out.println("Precio      : " + pizza1.getPrecio());
        

        System.out.println("\n\n******* Pizza 1 *******");
        System.out.println(pizza1.datos());
        System.out.println("\n\n******* Pizza 2 *******");
        System.out.println(pizza2.datos());
        
    }
}
