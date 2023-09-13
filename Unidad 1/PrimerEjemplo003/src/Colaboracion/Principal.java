
package Colaboracion;

import java.util.Scanner;


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
        // Crear otra canción.
        // solicitar los datos por la consola. 
        // todos los datos son obligatorios.
        // "transmitirla" vía spotify.
        System.out.println("\n\n***** Ingrese nueva canción:");
        Scanner leer = new Scanner(System.in);
        Cancion cancion2 = new Cancion();
        System.out.print("Ingrese nombre  : ");
        cancion2.setNombre(leer.next());
        System.out.print("Ingrese Album   : ");
        cancion2.setAlbum(leer.next());
        System.out.print("Ingrese Artista : ");
        cancion2.setArtista(leer.next());
        System.out.print("Ingrese Género  : ");
        cancion2.setGenero(leer.next());
        System.out.print("Ingrese Duración: ");
        cancion2.setDuracion(leer.nextInt());
        
        spotify.setCancion(cancion2);
        spotify.setSegundosReproduccion(3);
        
        System.out.println(spotify.imprimir());
        System.out.println("Segundos restantes " +
                spotify.segundosRestantes());
    }
    
}
