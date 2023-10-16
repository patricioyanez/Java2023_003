
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
        
    }
}
