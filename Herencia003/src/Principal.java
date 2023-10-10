
public class Principal {
    public static void main(String[] args) {
        Saludable manzana = new Saludable();
        manzana.setCalorias(100);
        manzana.setCodigo(1500);
        manzana.setEsOrigenNatural(true);
        manzana.setNombre("Manzana");
        manzana.setPrecio(1200);
        manzana.setSodio(50);
        
        System.out.println(manzana.imprimir());
        // Leer las ppt 2.1.1 y 2.2.1
        // Ejercicio 2: crear la super clase animal y 2 subclases
        // gato y perro. Definir 3 atributos en común y 1 especifico
        // para cada subclase. Crear 1 perro y 2 gatos, mostrar sus datos.
        
        System.out.println("\n\n=== Sobre Escritura ===");
        System.out.println(manzana.tipoComida());
        System.out.println(manzana.toString());
        
        String comoCocinar1 = "";
        String comoCocinar2 = "";
        String comoCocinar3 = "";
        
        comoCocinar1 = manzana.cocinar();
        comoCocinar2 = manzana.cocinar(21);
        comoCocinar3 = manzana.cocinar(53, "Fuego lento");
        
        System.out.println("\n=== sobre carga ===");
        System.out.println(comoCocinar1);
        System.out.println(comoCocinar2);
        System.out.println(comoCocinar3);
        
        
    }
}
