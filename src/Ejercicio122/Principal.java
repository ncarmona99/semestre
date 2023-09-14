package Ejercicio122;

/**
 *
 * @author Nicolás
 */
public class Principal {
    public static void main(String[] args) {
        Canciones cancion1 = new Canciones("When you were young", "The Strokes", 'S', true, 256);
        Canciones cancion2 = new Canciones();
        
        cancion2.setTitulo("I feel it coming");
        cancion2.setArtista("The weekend");
        cancion2.setDuracion(150);
        cancion2.setFavorita('S');
        cancion2.setDescargada(true);
    }
}
