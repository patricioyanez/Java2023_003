
public class Principal {
    public static void main(String[] args) {
        // Animal animal = new Animal(); // error pq es abstracta
        Mamifero perro = new Mamifero();
        System.out.println(perro.comer());
        String nombre = "";
        
        EjemploInterface ei = new EjemploInterface();
        ei.grabar();
        ei.eliminar();
        
        Double totalPago = 1000 * IOperaciones.IVA;
        System.out.println("Total:" + totalPago);
        
        // Ejercicios: 2.3.2 y 2.3.3
        
        
    }
}
