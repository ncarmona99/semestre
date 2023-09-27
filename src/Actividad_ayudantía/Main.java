package Actividad_ayudantía;

/**
 *
 * @author Nicolás
 */
public class Main {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo(); 
        //Crea Autores
        Autor go = new Autor("George","Orwell","Britanico");
        Autor bs = new Autor("Bram","Stoker","Irlandes");
        Autor ms = new Autor("Mary","Shelley","Britanico");
        Autor hm = new Autor("Herman","Melville","Estadounidense");
        Autor jg = new Autor("Johann","Goethe","Aleman");
        // Crea Libros
        Libro libro1 = new Libro("1984","001-00001",12000,go);
        Libro libro2 = new Libro("Dracula","001-00002",10000,bs);
        Libro libro3 = new Libro("Frankenstein","001-00003",11000,ms);
        Libro libro4 = new Libro("Moby Dick","001-00004",13000,hm);
        Libro libro5 = new Libro("Fausto","001-00005",14000,jg);
        //Agrega Libros a lista
        catalogo.agregarLibro(libro1);
        catalogo.agregarLibro(libro2);
        catalogo.agregarLibro(libro3);
        catalogo.agregarLibro(libro4);
        catalogo.agregarLibro(libro5);
        //Imprimir catalogo
        System.out.println("Catálogo:");
        catalogo.mostrarCatalogo();
        //Borra Libros de lista
        catalogo.eliminarLibro("001-00001");
        //Mostrar catalogo con libro borrado
        System.out.println("Catálogo sin 1984");
        catalogo.mostrarCatalogo();
        //Buscar libro por apellido
        System.out.println("Búsqueda por apellido");
        catalogo.buscarApellido("melville");
        //Buscar libro por titulo
        System.out.println("Busqueda por titulo");
        catalogo.buscarTitulo("frankenstein");
    }
}
