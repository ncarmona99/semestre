package Actividad_ayudantía;

/**
 *
 * @author Nicolás
 */
public class Principal {
    public static void main(String[] args) {
        Libro libro = new Libro();
        Libro libro1 = new Libro("1984","George Orwell",12000,"001-00001");
        Libro libro2 = new Libro("Drácula","Bram Stoker",10000,"001-00002");
        Libro libro3 = new Libro("Frankenstein","Mart Shelley",11000,"001-00003");
        Libro libro4 = new Libro("Moby Dick","Herman Melville",13000,"001-00004");
        Libro libro5 = new Libro("Fausto","Johann Goethe",14000,"001-00005");
        
        System.out.println(libro1.toString());
        libro1.eliminarLibro("001-00001");
        System.out.println(libro1.toString());
        
    }
}
