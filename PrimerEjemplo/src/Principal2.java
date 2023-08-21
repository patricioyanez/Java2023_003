import java.util.Scanner;

public class Principal2 {
// atajo 1: psvm + tab
// atajo 2: main + tab
    public static void main(String[] args) {
        // lee el teclado
        Scanner leerTeclado = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre     : ");
        String nombre = leerTeclado.next();
        
        System.out.println("Hola " + nombre + ", ¿Cómo estás?");
        
        
        System.out.print("Ingrese su edad       : ");
        int edad = leerTeclado.nextInt();
        System.out.println("Ud. tiene " + edad + " años");
        
        System.out.println("Ingrese su sueldo   : ");
        int sueldo = Integer.parseInt(leerTeclado.next());
        sueldo += 25000;
        
        System.out.println("Su sueldo final es  : " + sueldo);
    }
    
}
