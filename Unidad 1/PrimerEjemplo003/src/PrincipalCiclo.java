
public class PrincipalCiclo {
    public static void main(String[] args) {
        int numero = 0;
        
        while(numero < 10)
        {
            numero++; // numero = numero + 1 
            // numero +=1 // ++numero
            System.out.println("While: " + numero);
        }
        
        int x = 0;
        int y = 0;

        System.out.println("++x: " + ++x); //1 
        System.out.println("y++: " + y++); //0
        System.out.println("x/y: " + x + " " + y);
        
        for (int contador = 0; contador < 10; contador++) {
            System.out.println("Contador: " + contador);
        }
        
//        for(;;)
//        {
//            System.out.println("VIRUSSSSSS!!!!");
//        }
//        System.out.println("Contador: " + numero);

        int xx = 0;
        for (; xx < 10;) {
            System.out.println("For xx: " + xx++);
        }
        
        System.out.println("xx out: " + xx);
        
        xx = 0;
        for (; xx++ < 10;) {
            System.out.println("===> For xx: " + xx);
        }
        
        System.out.println("===> xx out: " + xx);
    }
}
