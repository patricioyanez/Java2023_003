
import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        Animal animalito = new Animal();
        Pez pez = new Pez();
        Ave ave = new Ave();
        
        
        System.out.println("Animal: " + animalito.mover());
        System.out.println("Pez   : " + pez.mover());
        System.out.println("Ave   : " + ave.mover());
        
        Animal pececito = new Pez();
        Animal pollo = new Ave();
        
        // Pez pez1 = new Animal();// Error, no es subclase
        
        ArrayList<Animal> zoo = new ArrayList<Animal>();
        zoo.add(ave);
        zoo.add(pez);
        zoo.add(pececito);
        zoo.add(pollo);
        zoo.add(new Animal());
        
        System.out.println("\n\n");
        System.out.println("*** Ver movimiento de animal ***");
        
        for (Animal animal : zoo) {
            System.out.println(animal.mover());
        }
        System.out.println("\n\n");
        System.out.println("*** Contar peces y aves ***");
        int peces = 0;
        for (Animal animal : zoo) {
            if(animal.getClass() == Ave.class)
                System.out.println("Objeto de tipo Ave");
            
            if(animal instanceof Pez)
                peces++;
        }
        System.out.println("Cantidad de peces: " + peces);
    }
}
