
package Colaboracion;


public class Principal {
    public static void main(String[] args) {
        // crear una cancion
        Cancion cancion = new Cancion();
        
        cancion.setNombre("Llueve sobre la ciudad");
        cancion.setArtista("Los Bunkers");
        cancion.setDuracion(300);
        cancion.setGenero("Rock");
        cancion.setAlbum("Vida de perros");
        
        System.out.println(cancion.imprimir());
        
        Streaming spotify = new Streaming(cancion,30);
        
        System.out.println("\n");
        System.out.println(spotify.imprimir());
        
        // Ejercicios:
        // Crear un método para saber cuantos segundos
        // quedan de la canción. Mostrar al usuario.
        System.out.print("\n**** Tiempo restante de la canción: ");
        System.out.print(spotify.segundosRestantes());
        
        // Ejercicio 2:
        // Crear otra canción y reproducirla.
        // solicitar los datos por la consola. 
        // todos los datos son obligatorios.
        // "transmitirla" vía spotify.
        
    }
    
}
