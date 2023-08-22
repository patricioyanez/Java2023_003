
import java.util.Scanner;


public class PrincipalIf {
    public static void main(String[] args) {
        System.out.println("Sentencia IF");
        
        if(1 == 1)
            System.out.println("1 es igual a 1");
        
        if(2 == 2)
        {
            System.out.println("1ra linea");
            System.out.println("2da linea");
            System.out.println("x lineas...");
        }
        
        if(3 > 10)
        {
            System.out.println("3 es mayor a 10");
        }
        else
        {
            System.out.println("3 no es mayor a 10");
        }
        
        int numero = 8;
        if(numero < 10)
        {
            System.out.println("Solo tienen unidades");
        }
        else if(numero < 100)
        {
            System.out.println("Tiene decenas");
        }
        else if(numero < 1000)
        {
            System.out.println("Tiene centanas");
        }
        else
        {
            System.out.println("El numero es muy grande");
        }
        
        // and y or --> && y ||
        int edad = 70;
        
        // Ejercicio: solicitar la edad al usuario y mostrar
        // en que generación pertence
        
        Scanner leerTeclado = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        edad = leerTeclado.nextInt();
        if(edad > 11 && edad <=23)
        {
            System.out.println("Pertence a la generación Z");
        }
        else if(edad > 23 && edad < 43)
        {
            System.out.println("Pertenece a la generación millennials");
        }
        else if(edad >= 43 && edad < 55)
        {
            System.out.println("Pertenece a la generación X");
        }
        else
        {
            System.out.println("Ud. es un boomers");
        }
        
    }
}
